package com.java.practise.array;

import java.io.*;
import java.util.*;

public class CricketProblem {
    public static int incrementor = 0;

    // Complete the noOfWaysToDrawTheGame function below.
    static int noOfWaysToDrawTheGame(int totalScore) {
        if(totalScore == 0){
            int counter = 0;
            for(int j = 1; j <= totalScore; j++){
                if(j % 10 == 0 || j % 10 == 8){
                    counter++;
                }
            }
            return counter;
        }
        List<Integer> scoreList = new ArrayList<>();
        for(int i = 1; i <= totalScore; i++){
            int reminder = i % 10;
            if(reminder != 0 && reminder != 8 && reminder % 2 != 1){
                scoreList.add(i);
            }
        }
        getTheSubSets(totalScore, scoreList, scoreList.size(), new Vector<Integer>());
        System.out.println(incrementor);
        return incrementor;
    }

    public static void getTheSubSets(int sum, List<Integer> integers, int intergesSize, Vector<Integer> subset) {
        if (sum == 0) {
            incrementor++;
        }
        if (intergesSize == 0) {
            return;
        }
        getTheSubSets(sum, integers, intergesSize - 1, subset);
        Vector<Integer> vIntegers = new Vector<>(subset);
        vIntegers.add(integers.get(intergesSize - 1));
        sum = sum - (integers.get(intergesSize - 1) % 10);
        getTheSubSets(sum, integers, intergesSize - 1, vIntegers);
    }

    public static void main(String[] args) throws IOException {
        int res = noOfWaysToDrawTheGame(6);
        System.out.println(res);
    }
}
