package com.java.practise.leetCode;

/**
 * dharmu.i on 19/03/19
 */

class LinkedList{

    public int value;
    public LinkedList node;
}

public class CreateLinkedList {

    private static void printLinkedList(LinkedList linkedList){
        while (linkedList != null){
            System.out.println(linkedList.value);
            linkedList = linkedList.node;
        }
    }

    private static void createLinkedList(LinkedList linkedList, int index, int[] numberList){
        linkedList.value = numberList[index];
        if (index+1 < numberList.length) {
            linkedList.node = new LinkedList();
            createLinkedList(linkedList.node, index + 1, numberList);
        }
    }
    public static void main(String[] args) {
        int[] IntegerList = new int[]{1,2,3,4,5};
        LinkedList linkedList1 = new LinkedList();
        createLinkedList(linkedList1,0,IntegerList);
        printLinkedList(linkedList1);
    }
}
