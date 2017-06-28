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

    private double precision = 0.0000000000001;

    @Test
    public void sampleTestCases() {
        //assertEquals(1.0, IntegerUtils.findUniq(new double[]{0, 1, 0}), precision);
        //assertEquals(2.0, IntegerUtils.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
        //assertEquals(0.55, IntegerUtils.findUniq(new double[]{0, 0, 0.55, 0, 0}), precision);
        assertEquals(8, IntegerUtils.findUniq(new double[]{7, 7, 8}), precision);
    }
    @Test
    public void sampleTestCases2() {
        //assertEquals(1.0, IntegerUtils.findUniq(new double[]{0, 1, 0}), precision);
        //assertEquals(2.0, IntegerUtils.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
        //assertEquals(0.55, IntegerUtils.findUniq(new double[]{0, 0, 0.55, 0, 0}), precision);
        assertEquals(8, IntegerUtils.findUniq(new double[]{8, 7, 7}), precision);
    }
}
