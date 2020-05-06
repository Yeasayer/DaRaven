/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daraven;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nik
 */
public class Raven implements FileLoad{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        NounsNAdjectives na;
        AdverbsNVerbs av;
        na = new NounsNAdjectives();
        av = new AdverbsNVerbs();
        System.out.println(na.getNoun());
        
        
        
        /*
        System.out.println("This is a madlib for Edgar Allen Poe's Poem 'The Raven'.");
        String place, fName, edVerb, edVerb2, ingVerb, pNoun;
        place = place();
        fName = femaleName();
        edVerb = edVerb();
        edVerb2 = edVerb();
        ingVerb = ingVerb();
        pNoun = pluralNoun();
        
        //Add other code for other classes here
        
        
        System.out.println("Once upon a midnight "+""+", While I");
        System.out.println("Pondered "+""+" and "+""+",");
        System.out.println("Over many a quaint and curious "+""+" of forgotten "+""+",");
        System.out.println("While I "+""+", nearly napping, suddenly there came a "+""+",");
        System.out.println("As of "+""+" gently rapping, rapping at my "+place+" door.");
        System.out.println("'Tis some "+""+",' I muttered, 'tapping at my "+place+" door-");
        System.out.println("Only this and nothing more.'"+"\n\n");
        System.out.println("Ah, I distinctly remember it was in the "+""+" December,");
        System.out.println("And each seperate "+ingVerb+" ember wrought its "+""+" upon the floor.");
        System.out.println("Eagerly I "+edVerb+" the morrow;- "+""+" I had sought to borrow");
        System.out.println("From my "+pNoun+" surcrease of sorrow- sorrow for the "+""+" Lenore-");
        System.out.println("For the "+""+" and "+""+" maiden whom the angels");
        System.out.println("named "+fName+" - ");
        System.out.println("Nameless here for evermore");
    }
    
    public static String femaleName(){
        String name = "";
        System.out.println("Please enter a female name.");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        return name;
    }
    
    public static String place() {
        String place = "";
        System.out.println("Please enter a place.");
        Scanner sc = new Scanner(System.in);
        place = sc.nextLine();
        return place;
    }
    
    public static String pluralNoun() {
        String pluralNoun = "";
        System.out.println("Please enter a plural noun.");
        Scanner sc = new Scanner(System.in);
        pluralNoun = sc.nextLine();
        return pluralNoun;
    }
    
    public static String edVerb() {
        String edVerb = "";
        System.out.println("Please enter a verb ending in 'ed'.");
        Scanner sc = new Scanner(System.in);
        edVerb = sc.nextLine();
        return edVerb;
    }
    
    public static String ingVerb() {
       String ingVerb = "";
        System.out.println("Please enter a verb ending in 'ing'.");
        Scanner sc = new Scanner(System.in);
        ingVerb = sc.nextLine();
        return ingVerb;
    }
}
