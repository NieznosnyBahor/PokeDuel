/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokeduel;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author nieznosnybahor
 */
public abstract class Database {

    static List<Pokemon> pokemonArray = new ArrayList<Pokemon>();
    static Map<String, String[]> typesArray = new HashMap<String, String[]>();

    static void createDB() throws IOException {
        //<editor-fold defaultstate="collapsed" desc="Import Pokemon">
        InputStream stream = Database.class.getResourceAsStream("/database/Pokemon.db");
        Scanner sc = new Scanner(stream);

        while (sc.hasNext()) 
        {
            String line = sc.nextLine();
            String parts[] = line.split(" ");
            int number = Integer.parseInt(parts[0]);
            pokemonArray.add(new Pokemon(number, parts[1], parts[2], parts[3]));
        }
        stream.close();
        //</editor-fold>
        //<editor-fold defaultstate="collapsed" desc="Import Types">
        stream = Database.class.getResourceAsStream("/database/Types.db");
        sc = new Scanner(stream);
        while (sc.hasNext()) 
        {
            String line = sc.nextLine();
            String parts[] = line.split("\t");
            String types[];
            try
            {
                types = parts[1].split(" ");
                typesArray.put(parts[0], types);
            }
            catch(Exception e)
            {
                String type[] = {parts[1]};
                typesArray.put(parts[0], type);
            }
            
            
        }
        //</editor-fold>

        // todo
    }

}
