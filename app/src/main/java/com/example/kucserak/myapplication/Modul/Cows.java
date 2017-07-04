package com.example.kucserak.myapplication.Modul;

/**
 * Created by kucserak on 28.6.2017.
 */

public class Cows {
    public static int[] findWrongWayCow(final char[][] field) {
        int[] horizont = {-1, -1};
        int[] vertical = {-1, -1};

        for (int row = 0; row < field.length; row++) {
            for (int column = 0; column < field[row].length; column++) {
                if (field[row][column] == 'c') {
                    if (column + 2 <= field[row].length && field[row][column + 1] == 'o' && field[row][column + 2] == 'w') {
                        if (vertical[0] == -1)
                            horizont = new int[]{row, column};
                        else
                            return vertical;
                    }
                    if (row + 2 <= field.length && field[row + 1][column] == 'o' && field[row + 2][column] == 'w') {
                        if (horizont[0] == -1)
                            vertical = new int[]{row, column};
                        else
                            return horizont;
                    }
                }
            }
        }
        return new int[]{0, 0};
    }
}
