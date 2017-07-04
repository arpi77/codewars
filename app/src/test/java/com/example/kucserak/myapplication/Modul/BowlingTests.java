package com.example.kucserak.myapplication.Modul;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kucserak on 29.6.2017.
 */

public class BowlingTests {
    @Test
    public void exampleTests()
    {
        Bowling bowling = new Bowling();
        int[] testArray = new int[]{1,2,3};
        assertEquals("I I I I\n I I I \n       \n       ", bowling.bowlingPins(testArray));

        testArray = new int[]{3,5,9};
        assertEquals("I I   I\n I   I \n  I    \n   I   ", bowling.bowlingPins(testArray));
    }
    @Test
    public void exampleTests2()
    {
        Bowling bowling = new Bowling();
        int[] testArray = new int[]{};

        String bowlingPins = bowling.bowlingPins(testArray);
        assertEquals("I I I I\n I I I \n       \n       ", bowling.bowlingPins(testArray));
    }
}
