/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daraven;

/**
 *
 * @author [Fix later]
 */


import java.io.FileNotFoundException;
import java.io.IOException;
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
        
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        
        try{
            String v2 = cl.getResource(vfile).getFile();
            String a2 = cl.getResource(advfile).getFile();
            //Comment out for later.
            System.out.println(a2+" "+v2);
            this.adverbs = this.getWords(a2);
            this.verbs = this.getWords(v2);
            System.out.println(Arrays.toString(verbs.toArray()));
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
    public String getVerb(){
        return adverbs.get((int)(Math.random() * adverbs.size()));
    }
    public String getVerb(int i){
        i = (i>adverbs.size()||i<0?0:i);
        return verbs.get(i);
    }
}
