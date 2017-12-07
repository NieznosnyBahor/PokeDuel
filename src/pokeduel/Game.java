/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokeduel;

import javax.swing.JOptionPane;

/**
 *
 * @author nieznosnybahor
 */
public abstract class Game {

    static Player player1;
    static Player player2;

    static void start() {
        player1 = new Player("Ania");
        player2 = new Player("Bania");
        int reply = JOptionPane.showConfirmDialog(null, "Do you wanna enter names?", "Question", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            player1.name = JOptionPane.showInputDialog(null, "Player 1?");
            player2.name = JOptionPane.showInputDialog(null, "Player 2?");
        }
        do {
        //<editor-fold defaultstate="collapsed" desc="Compare()">

            if (compare(player1.choosePokemon(), player2.choosePokemon()) == player1) {
                player1.score++;
            }
            if (compare(player1.choosePokemon(), player2.choosePokemon()) == player2) {
                player2.score++;
            }
            //</editor-fold>
        }
        while (!player1.deck.isEmpty() && !player2.deck.isEmpty());
    }

    static void showResults() {
        System.out.println("*-----------------*");
        System.out.println(" " + player1.name + " " + player1.score);
        System.out.println(" " + player2.name + " " + player2.score);
        System.out.println("");
        if (player1.score > player2.score) {
            System.out.println(player1.name + " wygrywa!");
        } else if (player2.score > player1.score) {
            System.out.println(player2.name + " wygrywa!");
        } else {
            System.out.println("Remis!");
        }
        System.out.println("*-----------------*");
    }
    private static Player compare(Pokemon p1, Pokemon p2) {
        
        
        return player2; // to do
    }
}
