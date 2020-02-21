package com.java.practise.other.non;

public class TwoDimensionalSortedArraySearch {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length <= 0 || matrix[0].length <= 0) {
            return false;
        }
        for (int j = matrix.length - 1; j >= 0; j--) {
            if (matrix[0][j] == target) {
                return true;
            } else if (matrix[0][j] < target) {
                for (int i = 1; i < matrix.length; i++) {
                    if (matrix[i][j] == target) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(new TwoDimensionalSortedArraySearch().searchMatrix(array,5));
    }
}
