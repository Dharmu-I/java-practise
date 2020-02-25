package com.java.practise.string;

public class JudgeCircle {

    public static boolean judgeCircle(String moves) {
        int ups = 0;
        int rights = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'U') {
                ups++;
            } else if (moves.charAt(i) == 'D') {
                ups--;
            } else if (moves.charAt(i) == 'R') {
                rights++;
            } else {
                rights--;
            }
        }
        return (ups == 0) && (rights == 0);
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("UDLLRR"));
    }
}
