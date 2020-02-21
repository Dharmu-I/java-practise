package com.java.practise.tree;

import java.util.*;

/**
 * dharmu.i on 01/04/19
 */

public class LevelOrderTreePrint {
    Map<Integer,List<Integer>> hashMap = new HashMap<>();

    public void levelOrder(BinaryTree binaryTree,int level){

        if (binaryTree.left != null)
            levelOrder(binaryTree.left,level+1);

        if (hashMap.get(level) == null) {
            hashMap.put(level,new ArrayList<>());
        }
        hashMap.get(level).add(binaryTree.value);

        if (binaryTree.right != null)
            levelOrder(binaryTree.right,level+1);
    }

    public static void main(String[] args) {
        int[] treeNodeValues = {3, 5, 1, 6, 2, 0, 8, -1, -1, 7, 4};
        BinaryTree binaryTree = new TreeConstruction().createTree(treeNodeValues);
        LevelOrderTreePrint levelOrderTreePrint = new LevelOrderTreePrint();
        levelOrderTreePrint.levelOrder(binaryTree,0);
    }
}
