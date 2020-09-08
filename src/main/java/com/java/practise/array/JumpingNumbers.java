package com.java.practise.array;

public class JumpingNumbers {

    public static void main(String[] args) {
        System.out.println(minimumWayToReachNumber(9, 0, 2, 0));
    }

    private static int minimumWayToReachNumber(int number, int start, int inc, int jumps) {
        if (number == start){
            System.out.println("Jumps "+jumps);
            return jumps;
        }else if(start < number){
            System.out.println("Jumps if "+jumps+" start "+start+" inc "+inc);
            return minimumWayToReachNumber(number, start + inc, inc, jumps+1);
        } else {
            System.out.println("Jumps if else "+jumps+" start "+start+" inc "+inc);
            return minimumWayToReachNumber(number, start - inc, inc, jumps+1);
        }
    }
}
