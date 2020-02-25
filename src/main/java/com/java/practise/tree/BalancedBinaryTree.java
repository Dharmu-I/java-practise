package com.java.practise.tree;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BalancedBinaryTree {

   static boolean valueToReturn = true;
    public static boolean isBalanced(BinaryTree root) {
        if (root != null) {
            System.out.println("Root value : " + root.value + "\t height : " + maxHeightOfNode(root));
            int leftHeight = maxHeightOfNode(root.left);
            int rightHeight = maxHeightOfNode(root.right);
            System.out.println("Left : " + leftHeight + "\t right height : " + rightHeight);
            if (Math.abs(leftHeight - rightHeight) > 1) {
                valueToReturn = false;
            }else {
                isBalanced(root.left);
                isBalanced(root.right);
            }
        }
        return valueToReturn;
    }

    private static int maxHeightOfNode(BinaryTree tree) {
        if (tree == null) {
            return 0;
        } else {
            return Math.max(maxHeightOfNode(tree.right) + 1, maxHeightOfNode(tree.left) + 1);
        }
    }

    public static void main(String[] args) {
        int[] treeValues = {1,2,2,3,-1,-1,3,4,-1,-1,4};
        TreeConstruction treeConstruction = new TreeConstruction();
        BinaryTree tree = treeConstruction.createTree(treeValues);
        System.out.println(isBalanced(tree));
    }
}
