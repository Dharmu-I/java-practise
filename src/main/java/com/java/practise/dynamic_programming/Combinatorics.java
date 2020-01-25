package com.java.practise.dynamic_programming;

public class Combinatorics {

    public static int generate(int n, int m){
        if ( n == 0 || m == 0 || n == m){
            return 1;
        }else {
            return generate(n-1,m) + generate(n-1,m-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(generate(5,4));
    }
}
