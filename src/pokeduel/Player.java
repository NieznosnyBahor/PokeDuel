/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokeduel;

import java.util.Random;

/**
 *
 * @author nieznosnybahor
 */
public class Player {

    String name;
    Pokemon deck[] = new Pokemon[20];
//    Pokemon hand[] = new Pokemon[5];

    Player(String name) {
        this.name = name;
        randDeck();
        showDeck();
    }

    final void randDeck() {
        Random r = new Random();
        for (int i = 0; i < deck.length; i++) {
            deck[i] = Database.array.get(r.nextInt(9));
        }

    }
    final void showDeck()
    {
        for (int i = 0; i < deck.length; i++) {
            deck[i].describe();
        }
    }
}
