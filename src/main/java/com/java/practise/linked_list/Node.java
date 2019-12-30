package com.java.practise.linked_list;

import java.util.List;

public class Node {
    private int value;

    private Node next;

    public Node(int nodeValue){
        this.value = nodeValue;
    }

    public void setNextNode(Node node){
        this.next = node;
    }

    public Node getNext(){
        return this.next;
    }

    public int getValue(){
        return this.value;
    }

    public static void prepareLinkedList(List<Integer> listValues, Node parentNode){
        for (Integer listValue : listValues){
            parentNode.next = new Node(listValue);
            parentNode = parentNode.next;
        }
    }

    public static void displayContent(Node parentNode){
        while (parentNode != null){
            System.out.println(parentNode.getValue());
            parentNode = parentNode.getNext();
        }
    }
}
