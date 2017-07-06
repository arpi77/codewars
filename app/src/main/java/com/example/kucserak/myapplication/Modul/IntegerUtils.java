package com.example.kucserak.myapplication.Modul;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public static int[] sortArray(int[] array) {
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int num = 0; num < array.length; num++) {
            if (array[num] % 2 == 0) continue;
            oddNumbers.add(array[num]);
        }
        Collections.sort(oddNumbers);
        int index = 0;
        for (int num = 0; num < array.length; num++) {
            if (array[num] % 2 == 0) result.add(array[num]);
            else {
                result.add(oddNumbers.get(index).intValue());
                index++;
            }
        }

        int[] ret = new int[result.size()];
        for (int i = 0; i < ret.length; i++)
            ret[i] = result.get(i);
        return ret;
    }
}
