package com.java.practise.linked_list;

import static com.java.practise.linked_list.SingleLinkedList.createLinkedList;
import static com.java.practise.linked_list.SingleLinkedList.display;

public class RemoveLastNthNode {

    public static NewNode removeLastNthNode(NewNode head, int n) {
        int size = sizeOfList(head);
        if (size == n){
            return head.getNext();
        }else {
            replace(size, n, head);
            return head;
        }
    }

    public static void replace(int size, int n, NewNode head){
        while (size - n-1 > 0){
            head = head.getNext();
            size--;
        }
        if (head.getNext() != null) {
            head.setNextNode(head.getNext().getNext());
        }else {
            head.setNextNode(null);
        }
    }
    public static int sizeOfList(NewNode node){
        int size = 0;
        while (node != null){
            node = node.getNext();
            size++;
        }
        return size;
    }

    public static void main(String[] args) {
        Integer[] linkedListValue = {1, 2, 3, 4, 5, 6};
        NewNode head = new NewNode(linkedListValue[0]);
        createLinkedList(linkedListValue, head);
        System.out.println("======== Before ======");
        display(head);
        head = removeLastNthNode(head, 6);
        System.out.println("======== After ======");
        display(head);
    }
}
