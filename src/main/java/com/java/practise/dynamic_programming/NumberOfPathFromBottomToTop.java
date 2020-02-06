package com.java.practise.dynamic_programming;

public class NumberOfPathFromBottomToTop {

    public static void main(String[] args) {
        System.out.println(numberOfPossiblePaths(2, 3));
        System.out.println(numberOfPossiblePathsDp(2, 3));
    }

    private static int numberOfPossiblePaths(int i, int j) {
        if (i == 0 && j == 0) {
            return 0;
        }

        if (i == 0 || j == 0) {
            return 1;
        }
        return numberOfPossiblePaths(i - 1, j) + numberOfPossiblePaths(i, j - 1);
    }

    private static int numberOfPossiblePathsDp(int i, int j) {
        int[][] mat = new int[i + 1][j + 1];
        for (int i1 = 0; i1 <= i; i1++) {
            mat[i1][0] = 1;
        }

        for (int j1 = 0; j1 <= j; j1++) {
            mat[0][j1] = 1;
        }

        for (int i1 = 1; i1 <= i; i1++) {
            for (int j1 = 1; j1 <= j; j1++) {
                mat[i1][j1] = mat[i1 - 1][j1] + mat[i1][j1 - 1];
            }
        }
        return mat[i][j];
    }
}
