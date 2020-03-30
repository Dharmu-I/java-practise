package com.java.walmart;

import java.util.*;

public class BinaryTree {

    public int identifyTheCousin(BTree tree, int value) {
        Map<Integer, List<Integer>> levelMap = new HashMap<>();
        return populateLevelMap(tree, value, levelMap, 1);
    }

    private int populateLevelMap(BTree tree, int value, Map<Integer, List<Integer>> levelMap, int level) {
        int levelOfValue = 0;
        Queue<BTree> queue = new LinkedList<>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            BTree polledTree = queue.poll();
            if (levelMap.get(level) == null) {
                List<Integer> list = new ArrayList<>();
                list.add(polledTree.value);
                levelMap.put(level, list);
            } else {
                levelMap.get(level).add(polledTree.value);
            }
            if (polledTree.right != null) {
                if ((polledTree.right.left != null && polledTree.right.left.value == value) ||
                        (polledTree.right.right != null && polledTree.right.right.value == value)) {
                    levelOfValue = level + 2;
                } else {
                    queue.add(polledTree.right);
                }
            }
            if (polledTree.left != null) {
                if ((polledTree.left.left != null && polledTree.left.left.value == value) ||
                        (polledTree.left.right != null && polledTree.left.right.value == value)) {
                    levelOfValue = level + 2;
                } else {
                    queue.add(polledTree.left);
                }
            }
            level++;
        }

        if (levelMap.get(levelOfValue) != null && !levelMap.get(levelOfValue).isEmpty()) {
            return levelMap.get(levelOfValue).get(levelMap.get(levelOfValue).size() - 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        /*
                    1
                   / \
                  2   3
                 /\   /\
                4  5 6  7
               /\   /  /
              8  9 10  11

            6 --> 5 -> left cousin
                  4 -> as cousin

             parents -> 7 , 6
             acenstor -> 3
              parent -> left
                        right
         */

        BTree root = new BTree(1);
        root.left = new BTree(2);
        root.right = new BTree(3);
        root.left.left = new BTree(4);
        root.left.right = new BTree(5);
        root.right.left = new BTree(6);
        root.right.right = new BTree(7);
        System.out.println(new BinaryTree().identifyTheCousin(root, 7));
    }
}

class BTree {

    int value;
    BTree left;
    BTree right;

    public BTree(int value) {
        this.value = value;
    }
}
