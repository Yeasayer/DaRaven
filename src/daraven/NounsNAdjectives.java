/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daraven;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.net.URL;
/**
 *
 * @author yeasayer
 */
public class NounsNAdjectives implements FileLoad{
    private ArrayList<String> nouns;
    private ArrayList<String> adjectives;
    private String nfile;
    private String afile;
    //Standard Constructor
    NounsNAdjectives() throws FileNotFoundException, IOException{
        this.afile = "Words/adjectives.txt";
        this.nfile = "Words/nouns.txt";
        
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        
        //try{
        String a2 = cl.getResource(afile).getFile();
        String n2 = cl.getResource(nfile).getFile();
        System.out.println(a2+" "+n2);
        this.nouns = this.getWords(n2);
        this.adjectives = this.getWords(a2);
        System.out.println(Arrays.toString(nouns.toArray()));
        /*} catch (Exception e){
            System.out.println(e);
        }*/
        
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
    public void getWordsFromFile(){
        
    }
}
