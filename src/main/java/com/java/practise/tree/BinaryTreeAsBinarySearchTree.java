package com.java.practise.tree;

import java.util.*;

public class BinaryTreeAsBinarySearchTree {

     boolean checkBST(Node root) {
         List<Integer> integerList = new ArrayList<>();
         getListOfNodeValues(root, integerList);
         return checkIsListSorted(integerList);
    }

    private boolean checkIsListSorted(List<Integer> integerList) {
        for (int i=0; i < integerList.size()-1; i++){
            if (integerList.get(i) >= integerList.get(i+1)){
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
     }

    private void getListOfNodeValues(Node root, List<Integer> integerList) {
         if (root != null){
             getListOfNodeValues(root.left, integerList);
             integerList.add(root.data);
             getListOfNodeValues(root.right, integerList);
         }
    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int t = scan.nextInt();
//        Node root = null;
//        while(t-- > 0) {
//            int data = scan.nextInt();
//            root = Node.insert(root, data);
//        }
//        scan.close();
        Node root = new Node(1);
        root.right = new Node(2);
        root.right.right = new Node(5);
        root.right.right.right = new Node(6);
        root.right.right.left = new Node(3);
        root.right.right.left.right = new Node(4);
        System.out.println(new BinaryTreeAsBinarySearchTree().checkBST(root));
    }
}
