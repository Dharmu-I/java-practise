package com.java.practise.stack;

import java.util.Stack;

public class AdjacentDuplicates {


    private static void removeAdjacentDuplicates(Stack<Integer> values) {
        Stack<Integer> dummyStack;
        do {
            System.out.println("Start : "+values.toString());
            boolean flag = true;
            dummyStack = new Stack<>();
            Integer value = values.pop();

            while (!values.empty()) {
                if (value != values.peek()) {
                    if (flag) {
                        dummyStack.push(value);
                    }
                    value = values.pop();
                    flag = true;
                } else {
                    flag = false;
                    values.pop();
                }
            }
            if (flag) {
                dummyStack.push(value);
            }
            values = (Stack<Integer>) dummyStack.clone();
            System.out.println("End : "+values.toString());
        }while (adjacentChecker(dummyStack));
        System.out.println(values.toString());
    }

    private static boolean adjacentChecker(Stack<Integer> vals) {
        if (vals.size() > 1){
            Integer value = vals.pop();
            while (!vals.empty()) {
                if (value == vals.peek()) {
                    return true;
                } else {
                    value = vals.pop();
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        Integer[] values = {1,5,6,8,8,8,0,1,1,0,6,5};
        Integer[] values = {1,9,6,8,8,8,0,1,1,0,6,5};
        Stack<Integer> integerStack = new Stack<>();
        for (Integer value: values){
            integerStack.push(value);
        }

        removeAdjacentDuplicates(integerStack);
    }
}
