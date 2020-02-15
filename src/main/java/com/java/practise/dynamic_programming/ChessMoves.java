package com.java.practise.dynamic_programming;

public class ChessMoves {

    public static void main(String[] args) {
//        System.out.println(findMinChessMoves(0, 1,4,3));
        System.out.println(findMinChessMovesDP(4,3));
    }

    private static int findMinChessMoves(int sourceM, int sourceN, int destinationM, int destinationN) {
        System.out.println("S M "+sourceM+" S N "+sourceN+" D M "+destinationM+" D N "+destinationN);
        if (sourceM == destinationM && sourceN == destinationN){
            return 0;
        }
        if (sourceM < 0 || sourceN < 0 || sourceM > 5 || sourceN > 5){
            return Integer.MAX_VALUE;
        }
        return findMinChessMoves(sourceM+1,sourceN+2, destinationM, destinationN)+1;
    }

    static int[][] board = new int[5][5];

    private static int findMinChessMovesDP(int destinationM, int destinationN){
        int delta = destinationM - destinationN;

        if( destinationN > delta )
            return 2 * ( ( destinationN - delta ) / 3 ) + delta;
        else
            return delta - 2 * ( ( delta - destinationN ) / 4 );
    }
}
