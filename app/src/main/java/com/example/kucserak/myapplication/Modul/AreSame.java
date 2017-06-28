package com.example.kucserak.myapplication.Modul;

import java.util.Arrays;


/**
 * Created by kucserak on 27.6.2017.
 */

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) return false;
        if (a.length == 0 && b.length == 0) return true;

        Arrays.sort(a);
        Arrays.sort(b);

        for (int indexA = 0; indexA < a.length - 1; indexA++) {
            int square = a[indexA] * a[indexA];
            int matchIndex = -1;
            for (int indexB = 0; indexB < b.length - 1; indexB++) {
                if (b[indexB] == square && indexA == indexB) {
                    matchIndex = indexB;
                    break;
                }
            }
            if (matchIndex != indexA) return false;
        }
        return true;
    }
}
