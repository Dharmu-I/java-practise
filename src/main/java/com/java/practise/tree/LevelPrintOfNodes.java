package com.java.practise.tree;

import java.util.*;

import static com.java.practise.tree.BinarySearchTree.createBst;

public class LevelPrintOfNodes {

    public static void printBoundaryNodes(Tree tree){
        Queue<Tree> queue1 = new LinkedList<>();

    }

    public static void levelOfEachNodes(Tree tree){
        Queue<Tree> queue = new LinkedList<>();
        int level = 0;
        queue.add(tree);
        while (!queue.isEmpty()){
            int currentQueueSize = queue.size();
            int index = 1;
            while (index <= currentQueueSize){
                Tree pollNode = queue.poll();
                System.out.println("Node value "+pollNode.value+" level : "+level);
                if (pollNode.left != null){
                    queue.add(pollNode.left);
                }
                if (pollNode.right != null){
                    queue.add(pollNode.right);
                }
                index++;
            }
            level++;
        }
    }

    public static void main(String[] args) {
        Tree tree = new Tree(7);
        int[] nodeValues = {5, 1, 0, 3, 2, 4, 6, 8, 9};
        createBst(tree, nodeValues);
        levelOfEachNodes(tree);
    }
}
