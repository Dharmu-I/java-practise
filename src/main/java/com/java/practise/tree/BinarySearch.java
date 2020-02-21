package com.java.practise.tree;

/**
 * dharmu.i on 26/03/19
 */

public class BinarySearch {

    public boolean searchNumber(int number, int[] numberList, int start, int end){

        if (end >= start){
            int mid = (start+end)/2;
            if (numberList[mid] == number){
                return true;
            }
            if (numberList[mid] < number){
                return searchNumber(number,numberList,mid+1,end);
            }
            return searchNumber(number,numberList,start,mid-1);
        }
        return false;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int [] numbers = {1,3,6,8,10,12,16};
        System.out.println("Number found : "+binarySearch.searchNumber(2121,numbers,0,numbers.length-1));
    }
}
