package com.java.practise.string;

import java.util.Stack;

public class BalancedParentheses {

    public static boolean isBracesBalanced(String braces){
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < braces.length(); i++){
            if (characterStack.empty()) {
                characterStack.push(braces.charAt(i));
            }else {
                Character closeBrace = braces.charAt(i);
                Character openBrace = identifyOpenBrace(closeBrace);
                if (openBrace.equals(closeBrace)) {
                    characterStack.push(openBrace);
                }else {
                    if (openBrace.equals(characterStack.peek())) {
                        characterStack.pop();
                    }else {
                        return false;
                    }
                }
            }
        }
        return characterStack.empty();
    }

    private static Character identifyOpenBrace(char charAt) {
        if (charAt == '}'){
            return '{';
        }else if (charAt == ']'){
            return '[';
        }else if (charAt == ')'){
            return '(';
        }else {
            return charAt;
        }
    }

    public static void main(String[] args) {
        System.out.println(isBracesBalanced("[()]{}{[()()]()}"));
        System.out.println(isBracesBalanced("[()]{}{[()()])}”"));
        System.out.println(isBracesBalanced("[(])"));
        System.out.println(isBracesBalanced("[](){}"));
    }
}
