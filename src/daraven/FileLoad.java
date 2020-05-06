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

import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;

/**
 *
 * @author yeasayer
 */
public interface FileLoad {
    default ArrayList<String> getWords(String filename) 
            throws FileNotFoundException, IOException{
        
        ArrayList<String> list = new ArrayList<String>();
        FileReader fr;
        String line;
        BufferedReader br; //HUEHUEHUE
        
        //NEED TO ADD TRY/CATCH FOR USER ADDED FILES JUST IN CASE!
        try{
        fr = new FileReader(filename);
        br = new BufferedReader(fr);
        while ((line = br.readLine()) != null)
            list.add(line);
        } catch (Exception e){
            System.err.print(e);
        }
        return list;
    }
    
}
