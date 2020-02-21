package com.java.practise.linked_list;

import java.util.ArrayList;
import java.util.List;

public class BasicLinkedList {
    private LinkListNode constructLinkedList(List<Integer> integerList){
        LinkListNode linkListNode = new LinkListNode(integerList.get(0));
        LinkListNode head = linkListNode;
        for (int i=1;i<integerList.size();i++){
            linkListNode.node = new LinkListNode(integerList.get(i));
            linkListNode = linkListNode.node;
        }
        return head;
    }

    private void pintLinkedList(LinkListNode head){
        while (head != null){
            System.out.println(head.value);
            head = head.node;
        }
    }

    public LinkListNode constructAndPrintLinkedList(List<Integer> integerList){
        LinkListNode head = constructLinkedList(integerList);
        pintLinkedList(head);
        System.out.println("Printing Linked list in revers order");
        printLinkedListInReverseOrder(head);
        return head;
    }

    private void printLinkedListInReverseOrder(LinkListNode head){
        if (head == null)
            return;
        printLinkedListInReverseOrder(head.node);
        System.out.println(head.value);
    }

    public static void main(String[] args) {
        BasicLinkedList basicLinkedList = new BasicLinkedList();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        basicLinkedList.constructAndPrintLinkedList(arrayList);
    }
}

class LinkListNode{

    int value;

    LinkListNode node;

    LinkListNode(int value){
        this.value = value;
    }
}