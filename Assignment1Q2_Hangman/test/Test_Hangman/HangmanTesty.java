/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_Hangman;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rebecca
 */
import assignment1q2_hangman.Hangman;
public class HangmanTesty {
    
    public HangmanTesty() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void TestIsFound()
    {
        int testStr = 0;
        int testAns = 0;
        Hangman theGaem = new Hangman("jazz");
        StringBuilder temp = new StringBuilder();
        temp.append("zzaj");
        theGaem.setGameAns(temp);
        testStr = theGaem.HashItem("jazz");
        testAns = theGaem.HashItem(temp.toString());
        System.out.println(testStr);
        System.out.println(testAns);
        assertEquals("Testing isFound", true, theGaem.isFound());
    }
}
