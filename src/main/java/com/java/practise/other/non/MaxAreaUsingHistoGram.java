package com.java.practise.other.non;

import java.util.Stack;

public class MaxAreaUsingHistoGram {

    void computeMaxArea(int[] elements){
        int area;
        int maxArea = 0;
        int i = 0;
        int top;
        Stack<Integer> integerStack = new Stack<>();
        for (;i < elements.length;){
            if (integerStack.isEmpty() || elements[integerStack.peek()] <= elements[i]){
                integerStack.push(i);
                i++;
            }else {
                top = integerStack.peek();
                integerStack.pop();
                if (integerStack.isEmpty()){
                    area = elements[top] * i;
                }else {
                    area = elements[top] * (i - integerStack.peek() - 1);
                }
                if (area > maxArea){
                    maxArea = area;
                }
            }
        }

        while (!integerStack.isEmpty()){
            top = integerStack.peek();
            integerStack.pop();
            if (integerStack.isEmpty()){
                area = elements[top]*i;
            }else {
                area = elements[top]*(i-integerStack.peek()-1);
            }
            if (area > maxArea){
                maxArea = area;
            }
        }

        System.out.println("Max area of the histogram is : "+maxArea);
    }

    public static void main(String[] args) {
        MaxAreaUsingHistoGram maxAreaUsingHistoGram = new MaxAreaUsingHistoGram();
        int[] elements = {2,1,2 };
        maxAreaUsingHistoGram.computeMaxArea(elements);
    }
}
