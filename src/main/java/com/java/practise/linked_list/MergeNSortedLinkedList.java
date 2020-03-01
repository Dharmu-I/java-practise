package com.java.practise.linked_list;

import java.util.PriorityQueue;

public class MergeNSortedLinkedList {

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (ListNode listNode : lists) {
            while (listNode != null) {
                priorityQueue.add(listNode.val);
                listNode = listNode.next;
            }
        }
        ListNode head = null;
        ListNode temp = null;
        while (!priorityQueue.isEmpty()){
            if (head == null){
                head = new ListNode(priorityQueue.poll());
                temp = head;
            }else {
                temp.next = new ListNode(priorityQueue.poll());
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ReverseNodeSumOfTwoLinkedList reverseNodeSumOfTwoLinkedList = new ReverseNodeSumOfTwoLinkedList();
        int[] numbers1 = {1, 4, 5};
        int[] numbers2 = {1, 3, 4};
        int[] numbers3 = {3, 6};
        ListNode listNode1 = new ListNode(numbers1[0]);
        ListNode listNode2 = new ListNode(numbers2[0]);
        ListNode listNode3 = new ListNode(numbers3[0]);
        reverseNodeSumOfTwoLinkedList.createListNode(numbers1,listNode1);
        reverseNodeSumOfTwoLinkedList.createListNode(numbers2,listNode2);
        reverseNodeSumOfTwoLinkedList.createListNode(numbers3,listNode3);
        ListNode[] listNodes = {listNode1, listNode2, listNode3};
        reverseNodeSumOfTwoLinkedList.display(new MergeNSortedLinkedList().mergeKLists(listNodes));
    }
}
