package com.java.practise.tree;

import java.util.*;

public class TopViewOfTree {

    private static Map<Integer,Integer> indexDataMap = new HashMap<>();
    private static Map<Integer,Integer> dataDepthMap = new HashMap<>();

    public static void topView(Node root) {
        traverseOfTree(root, 0,0);
        printBasedOnTheRank();
    }

    private static void printBasedOnTheRank() {
        for (int index : indexDataMap.keySet()){
            System.out.print(indexDataMap.get(index)+" ");
        }
    }

    private static void traverseOfTree(Node root, int index, int depth) {
        if (root != null){
            if (indexDataMap.get(index) == null){
                indexDataMap.put(index, root.data);
            } else {
                int data = indexDataMap.get(index);
                if(dataDepthMap.get(data) > depth){
                    indexDataMap.put(index, root.data);
                }
            }
            dataDepthMap.put(root.data, depth);
            traverseOfTree(root.left,index-1, depth+1);
            traverseOfTree(root.right,index+1, depth+1);
        }
    }

    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.right = new Node(2);
//        root.right.right = new Node(5);
//        root.right.right.right = new Node(6);
//        root.right.right.left = new Node(3);
//        root.right.right.left.right = new Node(4);
//        topView(root);

        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = Node.insert(root, data);
        }
        scan.close();
        topView(root);
    }
}
