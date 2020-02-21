package com.java.practise.stack;

import java.util.Stack;

public class MatchingBrace {


    private static void validateBraces(String braceString) {
        Stack<String> braceStack = new Stack<>();
        String[] braces = braceString.split("");
        for (String brace: braces){
            if (brace.equals("{") || brace.equals("[")){
                braceStack.push(brace);
            }else if (!braceStack.empty()) {
                if (brace.equals("}") && braceStack.peek().equals("{")) {
                    braceStack.pop();
                } else if (brace.equals("]") && braceStack.peek().equals("[")) {
                    braceStack.pop();
                }else {
                    System.out.println("Inappropriate braces");
                    return;
                }
            }else {
                System.out.println("Inappropriate braces");
                return;
            }
        }

        if (braceStack.empty()){
            System.out.println("Appropriate braces");
        }else {
            System.out.println("Inappropriate braces");
        }

        while (!braceStack.empty()){
            System.out.println(braceStack.pop());
        }
    }

    public static void main(String[] args) {

        String braceString = "{{[]{}}[]}";
        validateBraces(braceString);
    }
}
