/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1q2_hangman;

import java.util.Scanner;

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
        char theFlag = 'y';
        Scanner theKB = new Scanner(System.in);
        
        do{
            Hangman gameOne = new Hangman("the fox");
            System.out.println("Let's play a round of hangman");
            System.out.println("We are playing hangman.");
            gameOne.makeGuess();
            
            Hangman gameTwo = new Hangman("jazz");
            System.out.println("Let's play another round of hangman");
            System.out.println("We are playing hangman.");
            gameTwo.makeGuess();
            
            Hangman gameThree = new Hangman("quick");
            System.out.println("Let's play the final round of hangman");
            System.out.println("We are playing hangman.");
            gameThree.makeGuess();
            
            System.out.println("Would you like to continue? (Y/N)");
            theFlag = theKB.next().charAt(0);
            
        }while(theFlag == 'y');
    }
    
}
