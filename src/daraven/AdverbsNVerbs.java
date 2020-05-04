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


import java.util.ArrayList;

//Need for file IO. May revise later.
import java.io.*;

public class AdverbsNVerbs {
    
    private ArrayList<String> verbs;
    private ArrayList<String> adverbs;
    
    //Standard Constructor
    AdverbsNVerbs(){
        
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
    getAdverb(){
        
    }
}
