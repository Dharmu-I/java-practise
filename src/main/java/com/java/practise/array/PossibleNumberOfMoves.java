package com.java.practise.array;

public class PossibleNumberOfMoves {

    public int numberOfPaths(int source_i,int source_j, int destination_i, int destination_j){
        if (source_i == destination_i && source_j == destination_j){
            return 0;
        }
        int total = 0;
        if (source_i < destination_i) {
            total += 1 + numberOfPaths(source_i + 1, source_j, destination_i, destination_j);
        }
        if (source_j < destination_j) {
            total += 1 + numberOfPaths(source_i, source_j + 1, destination_i, destination_j);
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(new PossibleNumberOfMoves().numberOfPaths(0,0,0,0));
    }
}
