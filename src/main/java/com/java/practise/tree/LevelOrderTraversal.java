package com.java.practise.tree;

import java.util.*;

public class LevelOrderTraversal {

    private static final Scanner scan = new Scanner(System.in);
    private static Queue<Node> nodeQueue = new ArrayDeque<>();

    private static void levelOrder(Node root) {
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()){
            Node newNode = nodeQueue.remove();
            if (newNode != null){
                System.out.print(newNode.data+" ");
                if (newNode.left != null){
                    nodeQueue.add(newNode.left);
                }
                if (newNode.right != null){
                    nodeQueue.add(newNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = Node.insert(root, data);
        }
        scan.close();
        levelOrder(root);
        /** Output
         * 6
         * 1 2 5 3 6 4
         * 1 2 5 3 6 4
         */
    }
}
