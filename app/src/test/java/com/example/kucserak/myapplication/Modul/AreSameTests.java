package com.example.kucserak.myapplication.Modul;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by kucserak on 27.6.2017.
 */

public class AreSameTests {
    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(AreSame.comp(a, b), true);
    }

    @Test
    public void test2() {
        int[] a = new int[]{2, 2, 3};
        int[] b = new int[]{4, 9, 9};
        assertEquals(AreSame.comp(a, b), false);
    }

    @Test
    public void test8() {
        int[] a = new int[]{0, -14, 191, 161, 19, 144, 195, 1};
        int[] b = {1, 0, 14 * 14, 191 * 191, 161 * 161, 19 * 19, 144 * 144, 195 * 195};
        assertEquals(AreSame.comp(a, b), true);
    }
}
