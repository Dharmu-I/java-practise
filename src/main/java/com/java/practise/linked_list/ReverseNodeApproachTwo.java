package com.java.practise.linked_list;

import java.util.*;

public class ReverseNodeApproachTwo {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Queue<Integer> answerQueue = getSumOfListNodes(l1, l2);
        ListNode head = new ListNode(answerQueue.poll());
        constructListOfNode(answerQueue, head);
        return head;
    }

    private Queue<Integer> getSumOfListNodes(ListNode l1, ListNode l2) {
        Queue<Integer> l1Queue = getIntegerQueue(l1);
        Queue<Integer> l2Queue = getIntegerQueue(l2);
        Queue<Integer> answerQueue = new ArrayDeque<>();
        int carry = -1;
        while (!l1Queue.isEmpty() && !l2Queue.isEmpty()){
            int answerSum = l1Queue.poll() + l2Queue.poll();
            if (carry > 0){
                answerSum += carry;
            }
            carry = answerSum / 10;
            answerQueue.add(answerSum % 10);
        }
        carry = checkEmptyQueue(l1Queue, carry, answerQueue);
        carry = checkEmptyQueue(l2Queue, carry, answerQueue);
        if (carry > 0){
            answerQueue.add(carry);
        }
        return answerQueue;
    }

    private int checkEmptyQueue(Queue<Integer> integerQueue, int carry, Queue<Integer> answerQueue) {
        while (!integerQueue.isEmpty()) {
            int poppedValue = integerQueue.poll();
            if (carry > 0) {
                poppedValue += carry;
            }
            carry = poppedValue / 10;
            answerQueue.add(poppedValue % 10);
        }
        return carry;
    }
    private void constructListOfNode(Queue<Integer> answerQueue, ListNode head) {
        while (!answerQueue.isEmpty()){
            head.next = new ListNode(answerQueue.poll());
            head = head.next;
        }
    }

    private Queue<Integer> getIntegerQueue(ListNode listNode) {
        Queue<Integer> integerQueue = new ArrayDeque<>();
        while (listNode != null) {
            integerQueue.add(listNode.val);
            listNode = listNode.next;
        }
        return integerQueue;
    }

    public static void main(String[] args) {
        ReverseNodeSumOfTwoLinkedList reverseNodeSumOfTwoLinkedList = new ReverseNodeSumOfTwoLinkedList();
        int[] numbers1 = {9,9};
        int[] numbers2 = {1};
        ListNode listNode1 = new ListNode(numbers1[0]);
        ListNode listNode2 = new ListNode(numbers2[0]);
        reverseNodeSumOfTwoLinkedList.createListNode(numbers1, listNode1);
        reverseNodeSumOfTwoLinkedList.createListNode(numbers2, listNode2);
        reverseNodeSumOfTwoLinkedList.display(new ReverseNodeApproachTwo().addTwoNumbers(listNode1, listNode2));
    }
}
