package com.java.practise.linked_list;

import static com.java.practise.linked_list.SingleLinkedList.createLinkedList;

public class LinkedListReversePrint {

    public static int value = 10;

    public static void reverseDisplay(NewNode head){
        if (head != null) {
            reverseDisplay(head.getNext());
            if (value == 5) {
                System.out.println("Head value " + head.getValue() + " value : " + value);
            }
            value = value-1;
        }
    }

    public static void main(String[] args) {
        Integer[] elements = {0,1,2,3,4,5,6,7,8,9};
        NewNode head = new NewNode(elements[0]);
        createLinkedList(elements,head);
        reverseDisplay(head);
    }
}
