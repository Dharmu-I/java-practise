package com.java.practise.linked_list;

import java.util.List;

public class NewNode {
    private int value;

    private NewNode next;

    public NewNode(int nodeValue){
        this.value = nodeValue;
    }

    public void setNextNode(NewNode node){
        this.next = node;
    }

    public NewNode getNext(){
        return this.next;
    }

    public int getValue(){
        return this.value;
    }

    public static void prepareLinkedList(List<Integer> listValues, NewNode parentNode){
        for (Integer listValue : listValues){
            parentNode.next = new NewNode(listValue);
            parentNode = parentNode.next;
        }
    }

    public static void displayContent(NewNode parentNode){
        while (parentNode != null){
            System.out.println(parentNode.getValue());
            parentNode = parentNode.getNext();
        }
    }
}
