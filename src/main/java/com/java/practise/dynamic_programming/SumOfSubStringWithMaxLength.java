package com.java.practise.dynamic_programming;

public class SumOfSubStringWithMaxLength {

    public static int maxLength(char[] chars){
        int maxLength = 0;
        for (int i = 0; i < chars.length; i++){
            for (int j = i+1; j < chars.length; j+=2){
                int len = j - i+1;
                if (len < maxLength){
                    continue;
                }
                int lSum = 0;
                int rSum = 0;
                for (int k = 0; k < len/2; k++){
                    lSum += chars[i+k];
                    rSum += chars[i+k+len/2];
                }
                if (lSum == rSum){
                    maxLength = len;
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
//        char[] chars = new char[]{9,4,3,0,7,2,3};
        char[] chars = new char[]{1,4,2,1,2,4};
        System.out.println(maxLength(chars));
    }
}
