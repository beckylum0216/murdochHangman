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
public class Hangman {
    
    private String gameStr;
    private StringBuilder gameAns = new StringBuilder();
    private int gameTries;
    private int gameWrong;
    private String gameSet;
    private char tempAns;
    private String tempTest;
    Scanner theKB = new Scanner(System.in);
    
    public Hangman(String inputStr)
    {
        this.gameStr = inputStr;
        this.gameSet = this.gameSetOps();
        this.gameTries = 0;
    }

    public int getGameTries() {
        return gameTries;
    }
    
    public String getGameStr() {
        return gameStr;
    }

    public StringBuilder getGameAns() {
        return gameAns;
    }

    public int getGameWrong() {
        return gameWrong;
    }
    
    
    public void StudentInfo()
    {
        System.out.println("Name:               Rebecca Lim");
        System.out.println("Student Number:     33111264");
        System.out.println("Enrolement:         Internal");
        System.out.println("Tutor:              Mark Abernethy");
        System.out.println("Tutorial:           Thursday, 10.30am");
    }
    
    public void makeGuess()
    {
        
        do
        {
            this.getDisguisedWord();
            System.out.println("Guess a letter:");
            tempAns = theKB.next().charAt(0);
            tempTest = Character.toString(tempAns);
            
            if(Character.isDigit(tempAns))
            {
                System.out.println("Sorry, your guess must be an alphabet character from a to z.");
            }
            else
            {
                if((this.gameStr.contains(tempTest)))
                {
                    if(this.gameAns.toString().contains(tempTest))
                    {
                        System.out.println("You have made this guess already!");
                    }
                    else
                    {
                        this.gameAns.append(tempAns);
                        //gameRight = gameRight + 1;
                        System.out.println("Correct. Guesses made "+ this.getGameTries() + " with " + this.getGameWrong()+ " wrong.");
                    }

                }
                else
                {
                    gameWrong = gameWrong + 1;
                    System.out.println("Incorrect. Guesses made " + this.getGameTries() + " with " + this.getGameWrong()+ " wrong.");
                }
                
            }
            gameTries = gameTries + 1;
            
        }while(!(this.isFound()) );
        System.out.println("Congratulations, you found the secret word: "+ this.getGameStr());
    }
    
    public void getDisguisedWord()
    {
        boolean found = false;
        int j = 0;
        
        System.out.print("The disguised word is <");
        
        if(this.gameAns.length() == 0)
        {
            for(int i = 0; i < this.gameStr.length(); i +=1)
            {
                System.out.print("?");
            }

        }
        else
        {
            
            for(int i = 0; i < this.gameStr.length(); i++)
            {
                while(found == false && j < this.gameAns.length())
                {
                    if(this.gameAns.charAt(j) == this.gameStr.charAt(i))
                    {
                        System.out.print(this.gameStr.charAt(i));
                        found = true;
                    }
                    j++;
                }

                if (found == false)
                {
                    System.out.print("?");
                }
                found = false;
                j = 0;
            }
            
            
        }
            
        System.out.print("> \n");
    }
    
    
    public void getDisguisedWord2()
    {
        StringBuilder theMask = new StringBuilder();
        int showIndex;
        
       
        for(int i = 0; i < this.gameStr.length(); i +=1)
        {
            theMask.append("?");
        }
        if(this.gameAns.length() > 0)
        {
            for (int i = 0; i < this.gameAns.length(); i++)
            {
                showIndex = this.gameStr.indexOf(this.gameAns.charAt(i));
                theMask.setCharAt(showIndex, this.gameAns.charAt(i));
            }
            
        }
        
        System.out.printf("The disguised word is <%s> \n", theMask);
    }
    
   
    public boolean isFound()
    {
        boolean theFlag = false;
        int hashedStr;
        int hashedAns;
        hashedStr  = HashItem(this.gameSet);
        hashedAns = HashItem(this.gameAns.toString());
        if(hashedStr == hashedAns)
        {
            theFlag = true;
        }
               
        return theFlag;
    }
    
    public int HashItem(String inputStr)
    {
        int hashTot = 0;
        int hash  = 0;
        char str;
        for(int i = 0; i < inputStr.length(); i+=1)
        {
            str = inputStr.charAt(i);
            hash =  53 * str;
            hashTot += hash;
        }
        return hashTot;
    }
    
    public String gameSetOps()
    {
        String setResults = "";
        for(int i = 0; i < this.gameStr.length(); i+=1)
        {
            if(!setResults.contains(String.valueOf(this.gameStr.charAt(i))))
            {
                setResults += String.valueOf(this.gameStr.charAt(i));
            }
        }
        return setResults;
    }
    
    
    public void setGameAns(StringBuilder gameAns) {
        this.gameAns = gameAns;
    }
}
