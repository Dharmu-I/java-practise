package com.java.practise.dynamic_programming;

import java.util.Vector;

public class ChessMoves {

    static int sizeOfMatrix = 5;

    static class Cell{
        int x, y;
        int dis;

        public Cell(int x, int y, int dis)
        {
            this.x = x;
            this.y = y;
            this.dis = dis;
        }
    }

    public static void main(String[] args) {
        System.out.println(findMinChessMoves(0, 1,4,3));
      }

    private static int findMinChessMoves(int sourceM, int sourceN, int destinationM, int destinationN) {
        int dx[] = {-2, -1, 1, 2, -2, -1, 1, 2};
        int dy[] = {-1, -2, -2, -1, 1, 2, 2, 1};

        Vector<Cell> queue = new Vector<>();
        boolean[][] visited = new boolean[sizeOfMatrix][sizeOfMatrix];
        for (int i = 0; i < sizeOfMatrix; i++)
            for (int j = 0; j < sizeOfMatrix; j++)
                visited[i][j] = false;

        queue.add(new Cell(sourceM, sourceN, 0));
        visited[sourceM][sourceN] = true;

        while (!queue.isEmpty()){
            Cell cell = queue.remove(0);

            if (cell.x == destinationM && cell.y == destinationN){
                return cell.dis;
            }
            for (int i = 0; i < dx.length; i++){
                int x = dx[i] + cell.x;
                int y = dy[i] + cell.y;
                if (isInside(x, y) && !visited[x][y]){
                    queue.add(new Cell(x, y, cell.dis+1));
                    visited[x][y] = true;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    private static boolean isInside(int x, int y){
        if (x >=0 && y>= 0 && x < sizeOfMatrix && y < sizeOfMatrix){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
