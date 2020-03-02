package com.java.practise.array;

import java.util.Arrays;

/*
    If 2 neighbors are 1 && 1 the 0 and 0 && 0 also 0 else 1
 */

public class CellProblem {
    public int[] cellCompete(int[] states, int days) {
        int currentDay = 1;
        while (currentDay <= days) {
            int prevNbr = 0;
            for (int i = 0; i < states.length; i++) {
                int nextNbr = (i + 1) < states.length ? states[i + 1] : 0;
                if ((prevNbr == 1 && nextNbr == 1) ||
                        (prevNbr == 0 && nextNbr == 0)) {
                    prevNbr = states[i];
                    states[i] = 0;
                } else {
                    prevNbr = states[i];
                    states[i] = 1;
                }
            }
            currentDay++;
        }
        return states;
    }

    public static void main(String[] args) {
        int[] cells = {1, 0, 0, 0, 0, 1, 0, 0};
        System.out.println(Arrays.toString(new CellProblem().cellCompete(cells, 1)));
    }
}
