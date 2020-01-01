package com.java.practise.tree;

import java.util.*;

public class LeftViewAndRightViewOfTree {

    private static Map<Integer,List<Integer>> levelDataMap = new HashMap<>();
    private static Queue<Node> integers = new ArrayDeque<>();

    private static void levelOrderTraversal(Node root,int level){
        if (root != null){
            if (levelDataMap.get(level) != null){
                levelDataMap.get(level).add(root.data);
            }else {
                List<Integer> integerList =  new ArrayList<>();
                integerList.add(root.data);
                levelDataMap.put(level,integerList);
            }
            levelOrderTraversal(root.left,level+1);
            levelOrderTraversal(root.right, level+1);
        }
    }

    private static void leftView() {
        for (int level : levelDataMap.keySet()){
            System.out.print(levelDataMap.get(level).get(0)+" ");
        }
    }

    private static void rightView() {
        for (int level : levelDataMap.keySet()){
            System.out.print(levelDataMap.get(level).get(levelDataMap.get(level).size()-1)+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = Node.insert(root, data);
        }
        scan.close();
        levelOrderTraversal(root,0);
        System.out.println("Right");
        rightView();
        System.out.println("\nLeft");
        leftView();
    }


    //    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.right = new Node(2);
//        root.right.right = new Node(5);
//        root.right.right.right = new Node(6);
//        root.right.right.left = new Node(3);
//        root.right.right.left.right = new Node(4);
//        topView(root);
//    }

}
