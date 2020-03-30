package com.java.microsoft;

public class JumppingNumbers {

    public static void main(String[] args) {
        /*
            -2,-1,0,1,2,3,4

            Target => 3

            Start => 1
            increment -> 1

            i > target - i
            i < target + i

            if target == i

         */

        int[] jumps = {-2, -1, 0, 1, 2, 3, 4};
        System.out.println(identifyTheMinJumps(3, 1, 0));
    }

    private static int identifyTheMinJumps(int target, int incrementor, int index) {
        if (index == target) {
            return 0;
        }
        int posTarget = Integer.MAX_VALUE;
        int negTarget = Integer.MAX_VALUE;
        if (Math.abs(target) > Math.abs(index)) {
             posTarget = identifyTheMinJumps(target, incrementor, index + incrementor) + 1;
            negTarget = identifyTheMinJumps(target, incrementor, index - incrementor) + 1;
        }


        return 0;
    }
}
