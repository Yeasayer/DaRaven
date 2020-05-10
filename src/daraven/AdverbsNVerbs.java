/*
 * Copyright (C) 2020 yeasayer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package daraven;

/**
 *
 * @author Joseph Acevedo, Nik
 */


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class AdverbsNVerbs implements FileLoad{
    
    private ArrayList<String> verbs;
    private ArrayList<String> adverbs;
    
    private String vfile;
    private String advfile;
    
    //Standard Constructor
    AdverbsNVerbs() /*throws FileNotFoundException, IOException*/{
        this.vfile = "Words/verbs.txt";
        this.advfile = "Words/adverbs.txt";
        
        //ClassLoader cl = ClassLoader.getSystemClassLoader();
        InputStream stv=getClass().getClassLoader().getResourceAsStream(vfile);
        InputStream sta=getClass().getClassLoader().getResourceAsStream(advfile);
        
        
        try{
            //String v2 = cl.getResource(vfile).getFile();
            //String a2 = cl.getResource(advfile).getFile();
            //Comment out for later.
            //System.out.println(a2+" "+v2);
            this.adverbs = this.getWords(sta);
            this.verbs = this.getWords(stv);
            //System.out.println(Arrays.toString(verbs.toArray()));
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    //Use if you want alternative words from a different file.
    AdverbsNVerbs(String fs){
        
    }
    
    //If you want to manhandle it and put a bunch of words for both manually.
    AdverbsNVerbs(ArrayList<String> verb_arr, ArrayList<String> averb_arr){
        this.verbs = verb_arr;
        this.adverbs = averb_arr;
    }
    
    //Just get an adverb based on random selection.
    public String getAdverb(){
        return adverbs.get((int)(Math.random() * adverbs.size()));
    }
    public String getAdverb(int i){
        i = (i>adverbs.size()||i<0?0:i);
        return adverbs.get(i);
    }
    public ArrayList<String> getAllAdverbs(){
        return adverbs;
    }
    
    public String getVerb(){
        return verbs.get((int)(Math.random() * adverbs.size()));
    }
    public String getVerb(int i){
        i = (i>verbs.size()||i<0?0:i);
        return verbs.get(i);
    }
    public ArrayList<String> getAllVerbs(){
        return verbs;
    }
}
