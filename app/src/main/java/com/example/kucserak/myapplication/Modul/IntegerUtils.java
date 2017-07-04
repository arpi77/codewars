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

    public static double findUniq(double arr[]) {

        for (int index = 1; index < arr.length; index++) {
            if (index == arr.length - 1 && arr[index - 1] != arr[index]) return arr[index];
            if (arr[index - 1] != arr[index] && arr[index] != arr[index + 1]) return arr[index];
        }

        return arr[0];
    }

    public static int find(int[] integers) {
        Integer firstOdd = null;
        Integer firstEven = null;

        for (int number : integers) {
            if (number % 2 == 0) {
                if (firstEven == null) {
                    firstEven = number;
                } else if (firstOdd != null) {
                    return firstOdd;
                }
            } else {
                if (firstOdd == null) {
                    firstOdd = number;
                } else if (firstEven != null) {
                    return firstEven;
                }
            }
        }
        return integers[integers.length - 1];
    }
}
