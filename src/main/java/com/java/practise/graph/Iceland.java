package com.java.practise.graph;

public class Iceland {

    private static int countIslands(int[][] mat) {
        boolean[][] visited = new boolean[mat.length][mat[0].length];
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1 && !visited[i][j]) {
                    dfs(mat, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }

    private static void dfs(int[][] mat, int i, int j, boolean[][] visited) {
        if (mat[i][j] == 1 && !visited[i][j]) {
            visited[i][j] = true;
            if (i + 1 < mat.length && mat[i + 1][j] == 1 && !visited[i + 1][j]) {
                dfs(mat, i + 1, j, visited);
            }
            if (j + 1 < mat[i].length && mat[i][j + 1] == 1 && !visited[i][j + 1]) {
                dfs(mat, i, j + 1, visited);
            }
            if (i - 1 >= 0 && mat[i - 1][j] == 1 && !visited[i - 1][j]) {
                dfs(mat, i - 1, j, visited);
            }
            if (j - 1 >= 0 && mat[i][j - 1] == 1 && !visited[i][j - 1]) {
                dfs(mat, i, j - 1, visited);
            }
        }
    }

    public static void main(String[] args) {
        int mat[][] = {
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}};
        System.out.print(countIslands(mat));
    }
}
