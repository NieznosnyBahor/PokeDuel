/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pokeduel;

/**
 *
 * @author nieznosnybahor
 */
public class Pokemon {
    int number;
    String name;
    String type_1;
    String type_2;
//    boolean isPokemon;
//    boolean isZapper;

    Pokemon(int number) {
    
    }
    Pokemon(int number, String name, String type_1, String type_2)
    {
        this.number = number;
        this.name = name;
        this.type_1 = type_1;
        this.type_2 = type_2;
    }

    void describe() {
        System.out.println("... ... ...");
        System.out.println(number);
        System.out.println(name);
        System.out.println(type_1);
        if(!"null".equals(type_2))
            System.out.println(type_2);
    }
    
    
}
