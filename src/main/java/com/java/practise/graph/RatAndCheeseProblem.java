package com.java.practise.graph;

import java.util.LinkedList;
import java.util.Queue;

class Position {
    int positionI;

    int getPositionJ;

    public Position(int positionI, int getPositionJ) {
        this.positionI = positionI;
        this.getPositionJ = getPositionJ;
    }
}

public class RatAndCheeseProblem {

    public static int visitedPosition(int i, int j, int vertices) {
        return (i * vertices) + j;
    }

    public static boolean isBigCheeseReachable(int startI, int startJ, int[][] cheeseStore, int vertices, int cheeseValue) {
        boolean[] visited = new boolean[vertices * vertices];
        Queue<Position> queue = new LinkedList<>();
        queue.add(new Position(startI, startJ));
        visited[visitedPosition(startI, startJ, vertices)] = true;
        while (!queue.isEmpty()) {
            Position poll = queue.poll();
            int i = poll.positionI;
            int j = poll.getPositionJ;
            System.out.println("Pos I "+i+" Pos J "+j);
            if (cheeseStore[i][j] == cheeseValue){
                return true;
            }
            if (i + 1 < vertices && cheeseStore[i+1][j] != 0 && !visited[visitedPosition(i+1, j , vertices)]){
                queue.add(new Position(i+1, j));
                visited[visitedPosition(i+1, j , vertices)] = true;
            }
            if (j + 1 < vertices && cheeseStore[i][j+1] != 0 && !visited[visitedPosition(i, j+1 , vertices)]){
                queue.add(new Position(i, j+1));
                visited[visitedPosition(i, j+1 , vertices)] = true;
            }
            if (i - 1 >= 0 && cheeseStore[i-1][j] != 0 && !visited[visitedPosition(i-1, j , vertices)]){
                queue.add(new Position(i-1, j));
                visited[visitedPosition(i-1, j , vertices)] = true;
            }
            if (j - 1 >= 0 && cheeseStore[i][j-1] != 0 && !visited[visitedPosition(i, j-1 , vertices)]){
                queue.add(new Position(i, j-1));
                visited[visitedPosition(i, j-1 , vertices)] = true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] cheeseStore =
                {
                        {1, 0, 1, 1, 1, 0, 0, 1},
                        {1, 0, 0, 0, 1, 1, 1, 1},
                        {1, 0, 0, 0, 0, 0, 0, 0},
                        {1, 0, 1, 0, 9, 0, 1, 1},
                        {1, 1, 1, 0, 1, 0, 0, 1},
                        {1, 0, 1, 0, 1, 1, 0, 1},
                        {1, 0, 0, 0, 0, 1, 0, 1},
                        {1, 1, 1, 1, 1, 1, 1, 1}
                };
        System.out.println("Cheese found "+isBigCheeseReachable(0, 2, cheeseStore, 8, 9));
    }
}
