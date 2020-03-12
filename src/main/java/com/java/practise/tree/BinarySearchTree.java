package com.java.practise.tree;

public class BinarySearchTree {

    public static void createBst(Tree tree, int[] values) {
        for (int i = 0; i < values.length; i++) {
            insertValue(tree, values[i]);
        }
    }

    private static void insertValue(Tree tree, int value) {
        while (tree != null) {
            if (tree.value < value) {
                if (tree.right == null) {
                    tree.right = new Tree(value);
                    break;
                }
                tree = tree.right;
            } else {
                if (tree.left == null) {
                    tree.left = new Tree(value);
                    break;
                }
                tree = tree.left;
            }
        }
    }

    private static void inOrderTraversal(Tree tree) {
        if (tree != null) {
            if (tree.left != null) {
                inOrderTraversal(tree.left);
            }
            System.out.print(tree.value + "\t");
            if (tree.right != null) {
                inOrderTraversal(tree.right);
            }
        }
    }


    public static void main(String[] args) {
        Tree tree = new Tree(7);
        int[] nodeValues = {5, 1, 0, 3, 2, 4, 6, 8, 9};
        createBst(tree, nodeValues);
        inOrderTraversal(tree);
    }
}
