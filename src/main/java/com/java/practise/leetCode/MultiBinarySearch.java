package com.java.practise.leetCode;

/**
 * dharmu.i on 26/03/19
 */

public class MultiBinarySearch {

    public int binarySearch(int searchNumber,int[] numberList, int start, int end){

        if (end >= start){
            int mid = (start+end)/2;
            if (numberList[mid] == searchNumber){
                return mid;
            }
            if (searchNumber > numberList[mid]){
                return binarySearch(searchNumber,numberList, mid+1,end);
            }

            return binarySearch(searchNumber,numberList,start,mid-1);
        }

        return -1;
    }

    public int binarySearchOfFirstRow(int searchNumber,int[][] numberList, int start, int end){

        if (end >= start){
            int mid = (start+end)/2;
            if (numberList[mid][0] == searchNumber){
                return mid;
            }
            if (searchNumber > numberList[mid][0]){
                return binarySearchOfFirstRow(searchNumber,numberList, mid+1,end);
            }

            return binarySearchOfFirstRow(searchNumber,numberList,start,mid-1);
        }

        return start;
    }

    public static void main(String[] args) {

        int[][] numberList ={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int searchNumber = 1;
        int searchIndex = new MultiBinarySearch().binarySearchOfFirstRow(searchNumber,numberList,0,4);
        System.out.println("First row number : "+searchIndex);
        if (searchIndex == -1){
            searchIndex = 0;
        }else if(searchIndex > 4){
            searchIndex = 4;
        }
        System.out.println("Index : " + new MultiBinarySearch().binarySearch(searchNumber, numberList[searchIndex], 0, numberList.length - 1));

    }
}
