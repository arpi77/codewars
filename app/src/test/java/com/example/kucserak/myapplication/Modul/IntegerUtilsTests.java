package com.example.kucserak.myapplication.Modul;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kucserak on 26.6.2017.
 */

public class IntegerUtilsTests {
    @Test
    public void FirstTest(){
        assertEquals(23, IntegerUtils.solution(10));
    }

    @Test
    public void FirstTest2(){
        assertEquals(60, IntegerUtils.solution(16));
    }
}
