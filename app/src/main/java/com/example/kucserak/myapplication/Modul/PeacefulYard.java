package com.example.kucserak.myapplication.Modul;


import android.support.v4.util.Pair;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.sqrt;

/**
 * Created by kucserak on 3.7.2017.
 */

public class PeacefulYard {
    public static boolean peacefulYard(String[] yard, int minDistance) {
        //M, R, L
        List<Pair<Integer, Integer>> animalCoordinates = new ArrayList<>();
        for (int row = 0; row < yard.length; row++) {
            String line = yard[row];
            for (int position = 0; position < line.length(); position++) {
                if (line.charAt(position) == 'M' || line.charAt(position) == 'L' || line.charAt(position) == 'R') {

                    animalCoordinates.add(new Pair<>(row, position));
                }
            }
        }

        if (animalCoordinates.size() < 2) return true;

        for (int i = 0; i < animalCoordinates.size(); i++) {
            for (int j = i + 1; j < animalCoordinates.size(); j++) {
                Pair<Integer, Integer> firstAnimal = animalCoordinates.get(i);
                Pair<Integer, Integer> secondAnimal = animalCoordinates.get(j);

                double distance = sqrt(Math.pow(firstAnimal.first - secondAnimal.first, 2) + Math.pow(firstAnimal.second - secondAnimal.second, 2));
                if(distance < minDistance)
                    return false;
            }
        }

        return true;
    }
}
