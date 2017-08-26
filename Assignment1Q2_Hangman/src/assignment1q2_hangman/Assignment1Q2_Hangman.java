/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1q2_hangman;

/**
 *
 * @author rebecca
 */
public class Assignment1Q2_Hangman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hangman theGame = new Hangman("abracadabra");
        System.out.println("Let's play a round of hangman");
        System.out.println("We are playing hangman.");
        theGame.makeGuess();
        
    }
    
}
