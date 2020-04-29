/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daraven;

import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author yeasayer
 */
public class NounsNAdjectives {
    private ArrayList<String> nouns;
    private ArrayList<String> adjectives;
    
    //Standard Constructor
    NounsNAdjectives(){
        
    }
    
    //Use if you want alternative words from a different file.
    NounsNAdjectives(String fs){
        
    }
    
    //If you want to manhandle it and put a bunch of words for both manually.
    NounsNAdjectives(ArrayList<String> noun_arr, ArrayList<String> adj_arr){
        this.nouns = noun_arr;
        this.adjectives = adj_arr;
    }
}
