package com.java.practise.array;

public class SumOfEvenNumberOfQuery {

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] sumArray = new int[queries.length];
        int initialSum = 0;
        for(int i=0; i < A.length; i++){
            if(A[i] % 2 == 0){
                initialSum += A[i];
            }
        }

        for(int i = 0; i < queries.length; i++){
            int index = queries[i][1];
            int newValue = A[index] + queries[i][0];
            if(A[index] % 2 == 0 && newValue % 2 == 0){
                initialSum += queries[i][0];
            }else if(A[index] % 2 != 0 && newValue % 2 == 0){
                initialSum += newValue;
            }else if(A[index] % 2 == 0 && newValue % 2 != 0){
                initialSum -= A[index];
            }
            A[index] = newValue;
            sumArray[i] = initialSum;
        }
        return sumArray;
    }

    public static void main(String[] args) {
        int[] a = new int[2];
        a[0] = 3;
        a[1] = 2;
        int[][] b = new int[2][2];
        b[0][0] = 4;
        b[0][1] = 0;
        b[1][0] = 3;
        b[1][1] = 0;
        System.out.println(new SumOfEvenNumberOfQuery().sumEvenAfterQueries(a,b));
    }
}
