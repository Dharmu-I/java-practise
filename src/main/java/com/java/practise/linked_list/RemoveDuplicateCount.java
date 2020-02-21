package com.java.practise.linked_list;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateCount {

    public void removeDuplicate(NewNode parentNode){

        NewNode currentNode = parentNode;
        NewNode nextNode = parentNode.getNext();
        while (currentNode != nextNode && nextNode != null){
            if (currentNode.getValue() == nextNode.getValue()){
                nextNode = nextNode.getNext();
            }else if (currentNode.getValue() != nextNode.getValue()){
                currentNode = nextNode;
                nextNode = nextNode.getNext();
            }
        }
    }

    private List<Integer> getUniqueValue(NewNode parentNode){
        List<Integer> integers = new ArrayList<Integer>();
        while (parentNode != null && parentNode.getNext() != null){
            if (!integers.contains(parentNode.getValue())){
                integers.add(parentNode.getValue());
            }
            parentNode = parentNode.getNext();
        }
        return integers;
    }

    public NewNode removeDuplicateApproachOne(NewNode parentNode){
        List<Integer> integers = getUniqueValue(parentNode);
        parentNode = new NewNode(integers.remove(0));
        NewNode.prepareLinkedList(integers,parentNode);
        return parentNode;
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);arrayList.add(2);arrayList.add(3);arrayList.add(4);arrayList.add(5);arrayList.add(6);
        arrayList.add(1);arrayList.add(2);arrayList.add(3);arrayList.add(4);arrayList.add(5);arrayList.add(6);
        NewNode parentNode = new NewNode(arrayList.remove(0));
        NewNode.prepareLinkedList(arrayList,parentNode);
        System.out.println("Before");
        NewNode.displayContent(parentNode);
        RemoveDuplicateCount removeDuplicateCount = new RemoveDuplicateCount();
        parentNode = removeDuplicateCount.removeDuplicateApproachOne(parentNode);
        System.out.println("After");
        NewNode.displayContent(parentNode);
    }
}
