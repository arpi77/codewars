package com.example.kucserak.myapplication.Modul;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kucserak on 26.6.2017.
 */

public class StringUtils {
    public static String makeUpperCase(String str) {
        if (str == null) return null;
        return str.toUpperCase();
    }

    public static char findMissingLetter(char[] array) {
        String engAlphabet = "abcdefghijklmnopqrstuvwxyz";
        int startIndex = -1;
        boolean upper = false;

        for (int i = 0; i < array.length; i++) {
            if (startIndex == -1) {
                startIndex = engAlphabet.indexOf(array[i]);
                if (startIndex == -1) {
                    startIndex = engAlphabet.toUpperCase().indexOf(array[i]);
                    upper = true;
                }
            } else if (upper && engAlphabet.toUpperCase().charAt(startIndex + i) != array[i])
                return engAlphabet.toUpperCase().charAt(startIndex + i);
            else if (!upper && engAlphabet.charAt(startIndex + i) != array[i])
                return engAlphabet.charAt(startIndex + i);
        }
        return ' ';
    }
}
