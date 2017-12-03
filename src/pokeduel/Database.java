/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokeduel;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nieznosnybahor
 */
public abstract class Database {

    static List<Pokemon> array = new ArrayList<Pokemon>();
    

    static void fullfilArray() {
        InputStream stream = Database.class.getResourceAsStream("Database.db");
        Scanner sc = new Scanner(stream);
        
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String parts[] = line.split(" ");
            int number = Integer.parseInt(parts[0]);
            array.add(new Pokemon(number, parts[1], parts[2], parts[3]));
        }
    }

}
