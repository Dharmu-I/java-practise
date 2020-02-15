package com.java.practise.dynamic_programming;

public class InterLeavingOfString {
    String A = "yz";
    String B = "abcd";
    String C = "yabczd";

    public boolean isInterLeaving(int a, int b, int c){

        if (A.isEmpty() && B.isEmpty() && !C.isEmpty()){
            return Boolean.FALSE;
        }
        if (!A.isEmpty() && !B.isEmpty() && C.isEmpty()){
            return Boolean.FALSE;
        }
        if (A.isEmpty() && B.isEmpty() && C.isEmpty()){
            return Boolean.TRUE;
        }

        boolean presentA = Boolean.FALSE;
        boolean presentB = Boolean.FALSE;

        if (A.charAt(a) == C.charAt(c) && a+1 < A.length() && c+1 < C.length()){
            presentA = isInterLeaving(a+1, b, c+1);
        }
        if (B.charAt(b) == C.charAt(c) && b+1 < B.length() && c+1 < C.length()){
            presentB = isInterLeaving(a, b+1, c+1);
        }
        return presentA || presentB;
    }

    public boolean ownSolution(){
        if (A.length() + B.length() != C.length()){
            return Boolean.FALSE;
        }
        boolean mainFlag = Boolean.TRUE;
        int indexOfA = 0;
        int indexOfB = 0;
        for (int i=0; i < C.length(); i++){
            if (indexOfA < A.length() && C.charAt(i) == A.charAt(indexOfA)){
                indexOfA++;
                continue;
            }
            if (indexOfB < B.length() && C.charAt(i) == B.charAt(indexOfB)){
                indexOfB++;
                continue;
            }
            mainFlag = Boolean.FALSE;
            break;
        }
        return mainFlag;
    }

    public boolean dpSolution(){
        if (A.length() + B.length() != C.length()){
            return Boolean.FALSE;
        }

        int m = A.length();
        int n = B.length();
        int[][] mat = new int[m+1][n+1];
//        if ()
        return Boolean.TRUE;
    }

    public static void main(String[] args) {
        System.out.println(new InterLeavingOfString().ownSolution());
    }
}
