package com.java.practise.dynamic_programming;

public class Fibonacci {

    public int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int[] values = new int[n + 1];
        values[1] = 1;
        values[2] = 1;
        for (int i = 3; i <= n; i++) {
            values[i] = values[i - 1] + values[i - 2];
        }
        return values[n];
    }

    public int nthFib(int n) {
        int lastOfLast = 1;
        int last = 1;
        for (int i = 3; i <= n; i++) {
            int temp = last;
            last = temp+lastOfLast;
            lastOfLast = temp;
        }
        return last;
    }

    public static void main(String[] args) {
        System.out.println(new Fibonacci().fib(10));
        System.out.println(new Fibonacci().nthFib(10));
    }
}
