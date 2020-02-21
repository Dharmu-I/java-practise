package com.java.practise.other.non;

public class SearchByRowiseAndColoumnWiseSortedMatrix {

    void searchElement(int[][] sortedMatrix, int rowColumnSize, int elementToSearch){
        int i = 0;
        int j = 0;
        if (sortedMatrix[i][j] > elementToSearch && sortedMatrix[rowColumnSize][rowColumnSize] < elementToSearch){
            System.out.println("Element not found");
            return;
        }

        while (i <= rowColumnSize && j <= rowColumnSize){
            if (sortedMatrix[i][j] == elementToSearch){
                System.out.println("Element found at "+i+" and "+j+" position");
                break;
            }else if(sortedMatrix[i][j] > elementToSearch){
                for (int k=0;k <= i;k++){
                    if (sortedMatrix[k][j] == elementToSearch){
                        System.out.println("Element found at "+k+" and "+j+" position");
                        break;
                    }else if (sortedMatrix[i][k] == elementToSearch){
                        System.out.println("Element found at "+i+" and "+k+" position");
                        break;
                    }
                }
            }
                i++;
                j++;
        }

    }


    public static void main(String[] args) {

        SearchByRowiseAndColoumnWiseSortedMatrix search = new SearchByRowiseAndColoumnWiseSortedMatrix();

        int mat[][] = { { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 27, 29, 37, 48 },
                        { 32, 33, 39, 50 } };
        search.searchElement(mat, 3,29);
        search.searchElement(mat, 3,33);
    }
}
