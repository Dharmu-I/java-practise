package com.java.practise.stack;

import java.util.*;

public class PostFixEvaluation {

    private static void evaluateTheExpression(String postFixExpression) {

        String[] expressionSplit = postFixExpression.split("");
        Stack<Integer> integerStack = new Stack<>();
        List<String> expressionList = new ArrayList<>();
        expressionList.add("+");
        expressionList.add("*");
        expressionList.add("-");
        expressionList.add("/");

        for (String expressionValues: expressionSplit){
            if (expressionList.contains(expressionValues)){
                if (integerStack.size() >= 2){
                    Integer value1 = integerStack.pop();
                    Integer value2 = integerStack.pop();
                    Integer finalValue = Integer.MIN_VALUE ;
                    switch (expressionValues){
                        case "*": finalValue = value1 * value2;
                        break;
                        case "+": finalValue = value1 + value2;
                        break;
                        case "-": finalValue = value1 - value2;
                        break;
                        case "/": finalValue = value1 / value2;
                        break;
                        default:
                            System.out.println("invalid expression");

                    }
                    integerStack.push(finalValue);
                }else {
                    System.out.println("Stack dont value to perform operation");
                    return;
                }
            }else {
                integerStack.push(Integer.valueOf(expressionValues));
            }
        }

        if (integerStack.size() == 1){
            System.out.println("Expression output is : "+integerStack.pop());
        }else {
            System.out.println("Invalid expression");
        }
    }

    public static void main(String[] args) {

        String postFixExpression = "123*+9-";
        evaluateTheExpression(postFixExpression);
    }
}
