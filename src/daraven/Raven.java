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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Nik, Joseph Acevedo
 */
public class Raven{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        
        //RegEx magic, because like snapping my fingers for the first time at 
        //17, I keep on doing it because I have a lot of catching up to do!
        Pattern m = Pattern
               .compile("(adj)|(noun)|(ved)|(loc)|(ving)|(pnoun)|(adv)|(girl)",
                       Pattern.MULTILINE);
        
        NounsNAdjectives na;
        AdverbsNVerbs av;
        EverythingElse ee;
        
        na = new NounsNAdjectives();
        av = new AdverbsNVerbs();
        ee = new EverythingElse();
        
        String theWords;
        String theGirl;
        String thePlace;
        
        theWords = ee.getPoem();
        //That really doesn't sound right in 2020. Thank god for 100% male/female
        //class ratios.
        theGirl = ee.getGirl();
        thePlace = ee.getPlace();
        StringBuffer sb = new StringBuffer();
        
        Matcher evermore = m.matcher(theWords);
        while((evermore.find()) != false){
            if (evermore.group(1) != null)
                evermore.appendReplacement(sb, Matcher.quoteReplacement(
                        na.getAdjective()));
            if (evermore.group(2) != null)
                evermore.appendReplacement(sb, Matcher.quoteReplacement(
                        na.getNoun()));
            if (evermore.group(3) != null)
                evermore.appendReplacement(sb, Matcher.quoteReplacement(
                        av.getVerb()+"ed"));
            if (evermore.group(4) != null)
                evermore.appendReplacement(sb, Matcher.quoteReplacement(
                        thePlace));
            if (evermore.group(5) != null)
                evermore.appendReplacement(sb, Matcher.quoteReplacement(
                        av.getVerb()+"ing"));
            if (evermore.group(6) != null)
                evermore.appendReplacement(sb, Matcher.quoteReplacement(
                        na.getNoun()+"s"));
            if (evermore.group(7) != null)
                evermore.appendReplacement(sb, Matcher.quoteReplacement(
                        av.getAdverb()));
            if (evermore.group(8) != null)
                evermore.appendReplacement(sb, Matcher.quoteReplacement(
                        theGirl));
        }
        evermore.appendTail(sb);
        System.out.println(sb.toString());
        
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
    }*/
}
