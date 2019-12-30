package com.java.practise.linked_list;

public class ReverseNodeSumOfTwoLinkedList {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        double number1 = getNumberFromStack(l1);
        double number2 = getNumberFromStack(l2);
        double sumValue = number1+number2;
        ListNode head = new ListNode((int) (sumValue%10));
        if (sumValue >= 10) {
            constructList(sumValue / 10, head);
        }
        return head;
    }

    private void constructList(double i, ListNode head) {
        while (i >= 10){
            int reminder = (int) (i % 10);
            head.next = new ListNode(reminder);
            head = head.next;
            i = i / 10;
        }
        head.next = new ListNode((int) i);
    }

    private double getNumberFromStack(ListNode listNode) {
        StringBuilder initialValue = new StringBuilder();
        while (listNode != null) {
                initialValue.append(listNode.val);
                listNode = listNode.next;
        }
        return Double.parseDouble(initialValue.reverse().toString());
    }


    public void createListNode(int[] numbers, ListNode listNode){
        for (int i=1; i<numbers.length;i++){
            listNode.next = new ListNode(numbers[i]);
            listNode = listNode.next;
        }
    }

    public void display(ListNode listNode){
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static void main(String[] args) {
        ReverseNodeSumOfTwoLinkedList reverseNodeSumOfTwoLinkedList = new ReverseNodeSumOfTwoLinkedList();
        int[] numbers1 = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        int[] numbers2 = {5,6,4};
        ListNode listNode1 = new ListNode(numbers1[0]);
        ListNode listNode2 = new ListNode(numbers2[0]);
        reverseNodeSumOfTwoLinkedList.createListNode(numbers1,listNode1);
        reverseNodeSumOfTwoLinkedList.createListNode(numbers2,listNode2);
        reverseNodeSumOfTwoLinkedList.display(reverseNodeSumOfTwoLinkedList.addTwoNumbers(listNode1,listNode2));
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}