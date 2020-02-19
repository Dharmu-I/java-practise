package com.java.practise.dynamic_programming;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {

    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int sumSoFar = 0 ;
        int numberOfValues = 0;
        map.put(0,1);
        for(int value : nums){
            sumSoFar += value;
            numberOfValues += map.getOrDefault(sumSoFar-k,0);
            map.put(sumSoFar, map.getOrDefault(sumSoFar,0)+1);
        }
        return numberOfValues;
    }

    public static void main(String[] args) {
        int[] array = {1,1,1,2,0};
        System.out.println(new SubArraySum().subarraySum(array, 2));
    }
}
