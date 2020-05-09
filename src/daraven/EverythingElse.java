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

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author yeasayer
 */
public class EverythingElse implements FileLoad{
    
    private ArrayList<String> poem;
    private ArrayList<String> places;
    private ArrayList<String> girls;
    private String[] files = {
        "Words/TheRaven.txt",
        "Words/Places.txt",
        "Words/Gurlz.txt"
    };
    
    
    EverythingElse(){
        
        ClassLoader cl = ClassLoader.getSystemClassLoader();
        
        try{
            poem = this.getWords(cl.getResource(files[0]).getFile());
            places = this.getWords(cl.getResource(files[1]).getFile());
            girls = this.getWords(cl.getResource(files[2]).getFile());
        } catch (IOException e){
            System.out.println(e);
        }
        
    }
    
    public String getPoem(){
        String retpoem = "";
        for (String line : poem)
            retpoem += line+"\n";
        return retpoem;
    }
    public String getPlace(){
        return places.get((int)(Math.random() * places.size()));
    }
    
    //That doesn't sound right in 2020.
    public String getGirl(){
        return girls.get((int)(Math.random() * girls.size()));
    }
}
