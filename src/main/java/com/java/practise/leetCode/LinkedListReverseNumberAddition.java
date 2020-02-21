package com.java.practise.leetCode;

/**
 * dharmu.i on 18/03/19
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class LinkedListReverseNumberAddition {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        long sumValue = Long.parseLong(getNumberFromLinkedList(l1)) +
                Long.parseLong(getNumberFromLinkedList(l2));
        System.out.println("Sum value is : "+sumValue);
        String sum = String.valueOf(sumValue);
        String[] sumList = sum.split("");
        ListNode listNode = new ListNode(Integer.parseInt(sumList[sumList.length-1]));
        createLinkedList(sumList,listNode,sumList.length-2);
        printLinkedList(listNode);
        return listNode;
    }

    private static void printLinkedList(ListNode linkedList){
        while (linkedList != null){
            System.out.println(linkedList.val);
            linkedList = linkedList.next;
        }
    }

    public void createLinkedList(String[] stringArray,ListNode listNode, int index){
        listNode.next = new ListNode(Integer.parseInt(stringArray[index]));
        if (index-1  >= 0) {
            createLinkedList(stringArray, listNode.next,index-1);
        }
    }

    public String getNumberFromLinkedList(ListNode listNode){

        if (listNode == null)
            return "";

        return getNumberFromLinkedList(listNode.next)+listNode.val;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(9);

        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(9);
        listNode1.next.next = new ListNode(9);
        listNode1.next.next.next = new ListNode(9);
        listNode1.next.next.next.next = new ListNode(9);
        listNode1.next.next.next.next.next = new ListNode(9);
        listNode1.next.next.next.next.next.next = new ListNode(9);
        listNode1.next.next.next.next.next.next.next = new ListNode(9);
        listNode1.next.next.next.next.next.next.next.next = new ListNode(9);
        listNode1.next.next.next.next.next.next.next.next.next = new ListNode(9);

        LinkedListReverseNumberAddition linkedListReverseNumberAddition = new LinkedListReverseNumberAddition();
        linkedListReverseNumberAddition.addTwoNumbers(listNode,listNode1);
    }
}
