package com.example.kucserak.myapplication.Modul;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kucserak on 29.6.2017.
 */

public class Bowling {
    public String bowlingPins(int[] arr) {
        String result = "";
        int maxColumnCount = 6;
        int maxRowCount = 3;
        int pinNumberCounter = 1;

        for (int row = 0; row < maxRowCount; row++) {
            for (int column = maxColumnCount; column >= 0; column--) {
                int position = row + column;
                if (position == 0 || (position % 2 == 0 && column >= row && column <= maxColumnCount - row)) {
                    if (!contains(arr, pinNumberCounter))
                        result += pinNumberCounter;//"I";
                    else
                        result += " ";
                    pinNumberCounter++;
                } else result += " ";
            }
            if (row != 0)
                result += "\n";
        }

        return result;
    }

    public boolean contains(final int[] array, final int key) {
        for (final int i : array) {
            if (i == key) {
                return true;
            }
        }
        return false;
    }
}
