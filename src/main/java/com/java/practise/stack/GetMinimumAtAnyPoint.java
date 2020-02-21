package com.java.practise.stack;

import java.util.Stack;

public class GetMinimumAtAnyPoint {

    private static void findMinimumAtAnyPoint(Integer[] listOfNumbers) {
        Stack<Integer> minStack = new Stack<>();
        Stack<Integer> valueStack = new Stack<>();

        for (Integer value: listOfNumbers){
            if (minStack.empty() || minStack.peek() > value){
                minStack.push(value);
            }
            valueStack.push(value);
        }
        printMinimumAtAnyPoint(valueStack,minStack);
    }

    private static void printMinimumAtAnyPoint(Stack<Integer> valueStack, Stack<Integer> minStack) {
        while (!valueStack.empty()){
            System.out.println("value : "+valueStack.peek()+" minimum : "+minStack.peek());
            if (valueStack.peek().equals(minStack.peek())){
                minStack.pop();
            }
            valueStack.pop();
        }
    }

    public static void main(String[] args) {
        Integer[] listOfNumbers = {3,10,13,14,2,5,11,1};
        findMinimumAtAnyPoint(listOfNumbers);
    }
}
