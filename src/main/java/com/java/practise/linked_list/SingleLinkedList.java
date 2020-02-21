package com.java.practise.linked_list;
public class SingleLinkedList {

    public static NewNode addElementFirst(NewNode head, int value){
        NewNode node = new NewNode(value);
        node.setNextNode(head);
        return node;
    }

    public static void createLinkedList(Integer[] list, NewNode head){
        int i = 1;
        while (i < list.length){
            head.setNextNode(new NewNode(list[i]));
            head = head.getNext();
            i = i + 1;
        }
    }

    public static void display(NewNode head){
        while (head != null){
            System.out.println(head.getValue()+"\t");
            head = head.getNext();
        }
    }

    public static void addElementEnd(int value, NewNode head){
        while (head != null && head.getNext() != null){
            head = head.getNext();
        }

        head.setNextNode(new NewNode(value));
    }

    public static void addElementInMiddle(int value, NewNode head, int search_Value){
        while (head.getValue() != search_Value){
            head = head.getNext();
        }
       NewNode node = new NewNode(value);
        node.setNextNode(head.getNext());
        head.setNextNode(node);
    }

    public static void main(String[] args) {
        Integer[] linkedListValue = {1,2,3,4,5,6};
        NewNode head = new NewNode(linkedListValue[0]);
        createLinkedList(linkedListValue,head);
        display(head);
        System.out.println();
        head = addElementFirst(head,0);
        display(head);
        System.out.println();
        addElementEnd(8,head);
        display(head);
        System.out.println();
        addElementInMiddle(7,head,6);
        display(head);
    }
}
