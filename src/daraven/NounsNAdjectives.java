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

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.net.URL;
/**
 *
 * @author Joseph Acevedo, Nik, 
 */
public class NounsNAdjectives implements FileLoad{

    private ArrayList<String> nouns;
    private ArrayList<String> adjectives;
    private String nfile;
    private String afile;
    
//Standard Constructor
    NounsNAdjectives(){
        this.afile = "Words/adjectives.txt";
        this.nfile = "Words/nouns.txt";
        
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        
        try{
            String a2 = cl.getResource(afile).getFile();
            String n2 = cl.getResource(nfile).getFile();
            //System.out.println(a2+" "+n2);
            this.nouns = this.getWords(n2);
            this.adjectives = this.getWords(a2);
            //System.out.println(Arrays.toString(nouns.toArray()));
        } catch (Exception e){
            System.out.println(e);
        }
        
        //Lazy test code.
        
    }
    
    //Use if you want alternative words from a different file.
    NounsNAdjectives(String fs){
        
    }
    
    //If you want to manhandle it and put a bunch of words for both manually.
    NounsNAdjectives(ArrayList<String> noun_arr, ArrayList<String> adj_arr){
        this.nouns = noun_arr;
        this.adjectives = adj_arr;
    }
    
    
    //GETTERS AND SETTERS (Mostly getters)
    
    
    public String getNoun(){
        return nouns.get((int)(Math.random() * nouns.size()));
    }
    public String getNoun(int i){
        i = (i>nouns.size()||i<0?0:i);
        return nouns.get(i);
    }
    public ArrayList<String> getAllNouns(){
        return nouns;
    }
    
    public String getAdjective(){
        return adjectives.get((int)(Math.random() * adjectives.size()));
    }
    public String getAdjective(int i){
        i = (i>adjectives.size()||i<0?0:i);
        return adjectives.get(i);
    }
    public ArrayList<String> getAllAdjectives(){
        return adjectives;
    }
}
