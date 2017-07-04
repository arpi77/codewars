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

    @Test
    public void testExample() {
        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        assertEquals(3, IntegerUtils.find(exampleTest1));
        assertEquals(206847684, IntegerUtils.find(exampleTest2));
        assertEquals(0, IntegerUtils.find(exampleTest3));
    }
}
