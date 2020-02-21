package com.java.practise.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * dharmu.i on 29/03/19
 */

class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
        this.value = value;
    }
}

public class TreeConstruction {

    public BinaryTree createTree(int[] treeNodeValues) {
        BinaryTree binaryTree = new BinaryTree(treeNodeValues[0]);
        Queue<BinaryTree> binaryTreeStack = new LinkedList<>();
        binaryTreeStack.add(binaryTree);
        int i = 1;
        while (i < treeNodeValues.length) {
            BinaryTree binaryTree1 = binaryTreeStack.remove();
            if (treeNodeValues[i] >= 0) {
                binaryTree1.left = new BinaryTree(treeNodeValues[i]);
                binaryTreeStack.add(binaryTree1.left);
            }
            i = i + 1;
            if (i < treeNodeValues.length && treeNodeValues[i] >= 0) {
                binaryTree1.right = new BinaryTree(treeNodeValues[i]);
                binaryTreeStack.add(binaryTree1.right);
            }
            i = i + 1;
        }
        return binaryTree;
    }

    public void printTree(BinaryTree binaryTree) {
        if (binaryTree.left != null) {
            printTree(binaryTree.left);
        }
        System.out.print(binaryTree.value + "\t");
        if (binaryTree.right != null) {
            printTree(binaryTree.right);
        }
    }

    public static void main(String[] args) {

        int[] treeNodeValues = {3, 5, 1, 6, 2, 0, 8, -1, -1, 7, 4};
        TreeConstruction treeConstruction = new TreeConstruction();
        BinaryTree binaryTree = treeConstruction.createTree(treeNodeValues);
        treeConstruction.printTree(binaryTree);
    }
}
