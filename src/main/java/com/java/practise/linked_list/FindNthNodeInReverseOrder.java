package com.java.practise.linked_list;

import static com.java.practise.linked_list.SingleLinkedList.createLinkedList;
import static com.java.practise.linked_list.SingleLinkedList.display;

public class FindNthNodeInReverseOrder {

    public static void findNthNodeReverse(NewNode head, Integer nthNode){

        NewNode temp = head;
        NewNode forward = head;

        int i = 1;

        while (nthNode >= i){
            temp = temp.getNext();
            i = i+1;
        }

        while (temp != null){
            temp = temp.getNext();
            forward = forward.getNext();
        }

        System.out.println("Nth node : "+forward.getValue());
    }

    public static void main(String[] args) {
        Integer[] elements = {0,1,2,3,4,5,6,7,8,9};
        NewNode head = new NewNode(elements[0]);
        createLinkedList(elements,head);
        display(head);
        findNthNodeReverse(head,5);
    }
}
