package com.java.practise.tree;

import java.util.*;

public class LowestCommonAncestor {

    private static int getAncestor(Tree tree, int value1, int value2) {
        int commonAncestor = tree.value;
        Queue<Tree> queue = new LinkedList<>();
        queue.add(tree);
        while (!queue.isEmpty()){
            Tree polledTree = queue.poll();
            if (polledTree != null) {
                List<Integer> nodeValues = new ArrayList<>();
                getAllNodeValue(polledTree, nodeValues, value1, value2);
                if (nodeValues.size() == 2) {
                    commonAncestor = polledTree.value;
                }
                if (polledTree.left != null) {
                    queue.add(polledTree.left);
                }
                if (polledTree.right != null) {
                    queue.add(polledTree.right);
                }
            }
        }
        return commonAncestor;
    }

    private static void getAllNodeValue(Tree tree, List<Integer> nodeValues, int value1, int value2) {
        if (tree != null){
            if ((tree.value == value1 && !nodeValues.contains(value1)) ||
                    (tree.value == value2 && !nodeValues.contains(value2))) {
                nodeValues.add(tree.value);
            }
            if (nodeValues.size() <= 2 && tree.left != null){
                getAllNodeValue(tree.left, nodeValues, value1, value2);
            }
            if (nodeValues.size() <= 2 && tree.right != null){
                getAllNodeValue(tree.right, nodeValues, value1, value2);
            }
        }
    }


    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.left = new Tree(2);
        tree.right = new Tree(3);
        tree.left.left = new Tree(4);
        tree.left.right = new Tree(5);
        tree.right.left = new Tree(6);
        tree.right.right = new Tree(7);
        System.out.println(getAncestor(tree, 1, 7));
    }
}
