package com.java.practise.dynamic_programming;

public class StringEditReplaceOrDelete {

    public static void main(String[] args) {
        char[] chars1 = {'S', 'A', 'T', 'U', 'R', 'D', 'A', 'Y'};
        char[] chars2 = {'S', 'U', 'N', 'D', 'A', 'Y'};
        System.out.println("Edit distance " + editDistanceDp(chars1, chars2));
    }

    private static int editDistanceDp(char[] chars1, char[] chars2) {
        int[][] distance = new int[chars1.length + 1][chars2.length + 1];
        for (int i = 0; i <= chars1.length; i++) {
            distance[i][0] = i;
        }

        for (int j = 0; j <= chars2.length; j++) {
            distance[0][j] = j;
        }

        for (int i = 1; i <= chars1.length; i++) {
            for (int j = 1; j <= chars2.length; j++) {
                if (chars1[i-1] == chars2[j-1]){
                    distance[i][j] = distance[i-1][j-1];
                }else {
                    distance[i][j] = getMinimumOf(distance[i][j-1], distance[i-1][j], distance[i-1][j-1]) + 1;
                }
            }
        }
        return distance[chars1.length][chars2.length];
    }

    private static int getMinimumOf(int i, int i1, int i2) {
        return Math.min(Math.min(i,i1),i2);
    }
}
