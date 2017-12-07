/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokeduel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author nieznosnybahor
 */
public class Player {

    String name;
    List<Pokemon> deck = new ArrayList<Pokemon>();
    int score = 0;

    //       Pokemon hand[] = new Pokemon[5];
    
    

    // Konstruktor
    Player(String name) {
        this.name = name;
        randDeck();
        showDeck();
    }
    
    // Metody
    final void randDeck() {
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            deck.add(Database.array.get(r.nextInt(Database.array.size())));
        }

    }
    final void showDeck() {
        for (int i = 0; i < deck.size(); i++) {
            deck.get(i).describe();
        }
    }
    Pokemon choosePokemon(){      
        Random r = new Random();
        int number = r.nextInt(deck.size());
        Pokemon current = deck.get(number);
        deck.remove(number);
        return current;
    }
}
