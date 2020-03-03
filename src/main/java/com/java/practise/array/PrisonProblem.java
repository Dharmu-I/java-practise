package com.java.practise.array;

import java.util.List;

public class PrisonProblem {
    /*
     * Complete the 'prison' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     *  3. INTEGER_ARRAY h
     *  4. INTEGER_ARRAY v
     */

    public static long prison(int n, int m, List<Integer> h, List<Integer> v) {
        // Write your code here
        long[][] nValues = new long[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                nValues[i][j] = 1;
            }
        }

        for (int hrztl : h) {
            if (hrztl - 1 >= 0 && hrztl - 1 <= n) {
                for (int j = 0; j < m + 1; j++) {
                    nValues[hrztl - 1][j] = nValues[hrztl - 1][j] + nValues[hrztl][j];
                    nValues[hrztl][j] = nValues[hrztl - 1][j];
                }
            }
        }
        for (int vrtl : h) {
            if (vrtl - 1 >= 0 && vrtl - 1 <= m) {
                for (int i = 0; i < n + 1; i++) {
                    nValues[i][vrtl - 1] = nValues[i][vrtl - 1] + nValues[i][vrtl];
                    nValues[i][vrtl] = nValues[i][vrtl - 1];
                }
            }
        }

        long max = -1;
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (max < nValues[i][j]) {
                    max = nValues[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        
    }
}
