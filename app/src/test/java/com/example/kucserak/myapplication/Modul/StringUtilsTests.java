package com.example.kucserak.myapplication.Modul;

import com.example.kucserak.myapplication.Modul.StringUtils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class StringUtilsTests {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals("HELLO", StringUtils.makeUpperCase("hello"));
    }

    @Test
    public void addition_isCorrect2() throws Exception {
        assertEquals("HELLO", StringUtils.makeUpperCase(null));
    }
}