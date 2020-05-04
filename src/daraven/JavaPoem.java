/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daraven;
import java.util.ArrayList;
import java.util.Scanner;
import daraven.AdverbsNVerbs;
import daraven.NounsNAdjectives
/**
 *
 * @author Nik
 */
public class JavaPoem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This is a madlib for Edgar Allen Poe's Poem 'The Raven'.");
        String place, fName, edVerb, edVerb2, ingVerb, pNoun;
        place = place();
        fName = femaleName();
        edVerb = edVerb();
        edVerb2 = edVerb();
        ingVerb = ingVerb();
        pNoun = pluralNoun();
        
        //Add other code for other classes here
        
        adjClass = new AdverbsNVerbs();
        System.out.println("Once upon a midnight "+adjective1+", While I");
        System.out.println("Pondered "+adjective2+" and "+adjective3+",");
        System.out.println("Over many a quaint and curious "+noun1+" of forgotten "+noun2+",");
        System.out.println("While I "+edVerb+", nearly napping, suddenly there came a "+noun3+",");
        System.out.println("As of "+noun4+" gently rapping, rapping at my "+place+" door.");
        System.out.println("'Tis some "+noun5+",' I muttered, 'tapping at my "+place+" door-");
        System.out.println("Only this and nothing more.'"+"\n\n");
        System.out.println("Ah, I distinctly remember it was in the "+adjective4+" December,");
        System.out.println("And each seperate "+ingVerb+" ember wrought its "+noun5+" upon the floor.");
        System.out.println("Eagerly I "+edVerb+" the morrow;- "+adverb+" I had sought to borrow");
        System.out.println("From my "+pNoun+" surcrease of sorrow- sorrow for the "+adjective5+" Lenore-");
        System.out.println("For the "+adjective6+" and "+adjective7+" maiden whom the angels");
        System.out.println("named "+fName+" - ");
        System.out.println("Nameless here for evermore");
    }
    
    public static String femaleName(){
        ArrayList<String> fName = new ArrayList<>();
        fName.add("Karen");
        fName.add("Jenny");
        fName.add("Anna");
        fName.add("Caitlin");
        fName.add("Jessica");
        fName.add("Kate");
        fName.add("Lauren");
        fName.add("Erin");
        fName.add("Elizabeth");
        fName.add("Lynn");
        fName.add("Emily");
        fName.add("Melissa");
        fName.add("Gina");
        fName.add("Bethany");
        fName.add("Alyssa");
        fName.add("Julie");
        fName.add("Morgan");
        fName.add("Marie");
        fName.add("Crystal");
        fName.add("Kris");
        String name = "";
        System.out.println("Please enter a number between 1 and 20 for a female name.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 1 && num <= 20)
        {
            name = fName.get(num-1);
            
        }
        else if (num == -99)
        {
         System.out.println(fName);
        }
        else
        {
            while(num <= 1 && num >= 20) {
                System.out.println("Not a correct number! Please enter a number between 1 and 20.");
                num = sc.nextInt();
            }
            name = fName.get(num-1);
        }
        return name;
    }
    
    public static String place() {
        ArrayList<String> place = new ArrayList<>();
        place.add("home");
        place.add("library");
        place.add("school");
        place.add("shower");
        place.add("car");
        place.add("office");
        place.add("bed");
        place.add("studio");
        place.add("kitchen");
        place.add("class");
        place.add("garden");
        place.add("store");
        place.add("restaraunt");
        place.add("church");
        place.add("wharf");
        place.add("boat");
        place.add("pier");
        place.add("cemetary");
        place.add("pantry");
        place.add("factory");
         String name = "";
        System.out.println("Please enter a number between 1 and 20 for a place.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 1 && num <= 20)
        {
            name = place.get(num-1);
            
        }
        else if (num == -99)
        {
         System.out.println(place);
        }
        else
        {
            while(num <= 1 && num >= 20) {
                System.out.println("Not a correct number! Please enter a number between 1 and 20.");
                num = sc.nextInt();
            }
            name = place.get(num-1);
        }
        return name;
    }
    
    public static String pluralNoun() {
        ArrayList<String> pNoun = new ArrayList<>();
        pNoun.add("birds");
        pNoun.add("dogs");
        pNoun.add("cats");
        pNoun.add("people");
        pNoun.add("fish");
        pNoun.add("buildings");
        pNoun.add("houses");
        pNoun.add("televisions");
        pNoun.add("trees");
        pNoun.add("clothes");
        pNoun.add("chairs");
        pNoun.add("planets");
        pNoun.add("electronics");
        pNoun.add("cows");
        pNoun.add("cars");
        pNoun.add("teeth");
        pNoun.add("books");
        pNoun.add("programs");
        pNoun.add("plays");
        pNoun.add("eyes");
         String name = "";
        System.out.println("Please enter a number between 1 and 20 for a plural noun.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 1 && num <= 20)
        {
            name = pNoun.get(num-1);
            
        }
        else if (num == -99)
        {
         System.out.println(pNoun);
        }
        else
        {
            while(num <= 1 && num >= 20) {
                System.out.println("Not a correct number! Please enter a number between 1 and 20.");
                num = sc.nextInt();
            }
            name = pNoun.get(num-1);
        }
        return name;
    }
    
    public static String edVerb() {
        ArrayList<String> eVerb = new ArrayList<>();
        eVerb.add("walked");
        eVerb.add("jumped");
        eVerb.add("danced");
        eVerb.add("talked");
        eVerb.add("argued");
        eVerb.add("sleeped");
        eVerb.add("climbed");
        eVerb.add("played");
        eVerb.add("yawned");
        eVerb.add("cleaned");
        eVerb.add("died");
        eVerb.add("waited");
        eVerb.add("wanted");
        eVerb.add("decided");
        eVerb.add("asked");
        eVerb.add("looked");
        eVerb.add("noticed");
        eVerb.add("rushed");
        eVerb.add("rejected");
        eVerb.add("pretended");
         String name = "";
        System.out.println("Please enter a number between 1 and 20 for a verb ending in ed.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 1 && num <= 20)
        {
            name = eVerb.get(num-1);
            
        }
        else if (num == -99)
        {
         System.out.println(eVerb);
        }
        else
        {
            while(num <= 1 && num >= 20) {
                System.out.println("Not a correct number! Please enter a number between 1 and 20.");
                num = sc.nextInt();
            }
            name = eVerb.get(num-1);
        }
        return name;
    }
    
    public static String ingVerb() {
        ArrayList<String> iVerb = new ArrayList<>();
        iVerb.add("running");
        iVerb.add("jumping");
        iVerb.add("swimming");
        iVerb.add("climbing");
        iVerb.add("walking");
        iVerb.add("singing");
        iVerb.add("thinking");
        iVerb.add("playing");
        iVerb.add("dancing");
        iVerb.add("fighting");
        iVerb.add("sleeping");
        iVerb.add("talking");
        iVerb.add("shivering");
        iVerb.add("yawning");
        iVerb.add("cleaning");
        iVerb.add("washing");
        iVerb.add("dashing");
        iVerb.add("fleeing");
        iVerb.add("flying");
        iVerb.add("dying");
         String name = "";
        System.out.println("Please enter a number between 1 and 20 for a verb ending in ing.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 1 && num <= 20)
        {
            name = iVerb.get(num-1);
            
        }
        else if (num == -99)
        {
         System.out.println(iVerb);
        }
        else
        {
            while(num <= 1 && num >= 20) {
                System.out.println("Not a correct number! Please enter a number between 1 and 20.");
                num = sc.nextInt();
            }
            name = iVerb.get(num-1);
        }
        return name;
    }
}
