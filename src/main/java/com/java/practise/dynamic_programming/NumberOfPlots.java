package com.java.practise.dynamic_programming;

public class NumberOfPlots {

    public static int getPossiblePlotArrangement(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        return getPossiblePlotArrangement(n-1)+getPossiblePlotArrangement(n-2);
    }

    public static void main(String[] args) {
        System.out.println(getPossiblePlotArrangement(4));
    }
}
