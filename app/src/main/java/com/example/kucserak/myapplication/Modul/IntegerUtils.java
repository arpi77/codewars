package com.example.kucserak.myapplication.Modul;

/**
 * Created by kucserak on 26.6.2017.
 */

public class IntegerUtils {
    public static int solution(int number) {
        int result = 0;
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0) {
                result += i;
                continue;
            }
            result += i % 5 == 0 ? i : 0;
        }
        return result;
    }
}
