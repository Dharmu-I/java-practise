package com.java.practise.linked_list;


import static com.java.practise.linked_list.SingleLinkedList.createLinkedList;
import static com.java.practise.linked_list.SingleLinkedList.display;

public class LinkListOperations {

    public static void evenOrOddLength(NewNode head){

        boolean flag = false;

        while (head != null){
            if (head.getNext() == null){
                flag = true;
            }
            if (head.getNext() != null) {
                head = head.getNext().getNext();
            }
        }

        if (flag){
            System.out.println("Odd linked list");
        }else {
            System.out.println("Even linked list");
        }

    }

    public static void createLoop(NewNode head, Integer[] listValues){

        int i =1;
        NewNode loopStart=null;

        while (i < listValues.length){
            NewNode node = new NewNode(listValues[i]);
            if (i == 6){
                loopStart = node;
            }
            head.setNextNode(node);;
            head = head.getNext();
            i = i +1;
        }

        head.setNextNode(loopStart);

    }

    public static void findLoopExist(NewNode head){

        boolean loop = false;
        NewNode even = head.getNext();
        NewNode odd = head.getNext().getNext();

        while (even != null && odd != null){
            if (even == odd){
                loop = true;
                break;
            }
            even = even.getNext();
            odd = odd.getNext().getNext();
        }

        if (loop){
            System.out.println("Loop exist");
        }else {
            System.out.println("No loop");
        }

    }

    public static void startNodeOfTheLoop(NewNode head){

        NewNode even = head.getNext();
        NewNode odd = head.getNext().getNext();

        while (even != null && odd != null){

            if (even == odd){
                break;
            }
            even = even.getNext();
            odd = odd.getNext().getNext();
        }



        while (even != null && head != null){

            if (head == even){
                System.out.println("Loop start values : "+head.getValue());
                break;
            }

            even = even.getNext();
            head = head.getNext();

        }

    }

    public static void main(String[] args) {
        Integer[] listValues = {0,1,2,3,4,5,6,7,8,9};
        NewNode head = new NewNode(listValues[0]);
        createLinkedList(listValues,head);
        display(head);
        evenOrOddLength(head);
        createLoop(head,listValues);
        findLoopExist(head);
        startNodeOfTheLoop(head);
    }
}
