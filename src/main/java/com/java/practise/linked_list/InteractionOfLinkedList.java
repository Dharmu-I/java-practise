package com.java.practise.linked_list;

public class InteractionOfLinkedList {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA != null){
            getIntersectionNode(headA.next, headB);
        }
        if (headB != null){
            getIntersectionNode(headA,headB.next);
        }
        if (headA != null && headB != null) {
            System.out.println(headA.val + " : " + headB.val);
        }
        return null;
    }

    public static void main(String[] args) {
        ReverseNodeSumOfTwoLinkedList reverseNodeSumOfTwoLinkedList = new ReverseNodeSumOfTwoLinkedList();
        int[] numbers1 = {1, 4, 5};
        int[] numbers2 = {2,6};
        ListNode listNode1 = new ListNode(numbers1[0]);
        ListNode listNode2 = new ListNode(numbers2[0]);
        reverseNodeSumOfTwoLinkedList.createListNode(numbers1,listNode1);
        reverseNodeSumOfTwoLinkedList.createListNode(numbers2,listNode2);
        System.out.println(getIntersectionNode(listNode1, listNode2));
    }
}
