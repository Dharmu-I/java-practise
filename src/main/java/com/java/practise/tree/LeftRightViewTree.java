package com.java.practise.tree;

/**
 * dharmu.i on 01/04/19
 */

public class LeftRightViewTree {

    public void printLeftView(BinaryTree binaryTree){
        LevelOrderTreePrint levelOrderTreePrint =new LevelOrderTreePrint();
        levelOrderTreePrint.levelOrder(binaryTree,0);
        for (int key: levelOrderTreePrint.hashMap.keySet()){
            System.out.println(levelOrderTreePrint.hashMap.get(key).get(0));
        }
    }

    public void printRightView(BinaryTree binaryTree){
        LevelOrderTreePrint levelOrderTreePrint =new LevelOrderTreePrint();
        levelOrderTreePrint.levelOrder(binaryTree,0);
        for (int key: levelOrderTreePrint.hashMap.keySet()){
            System.out.println(levelOrderTreePrint.hashMap.get(key).get(levelOrderTreePrint.hashMap.get(key).size()-1));
        }
    }

    public void topView(BinaryTree binaryTree){
        LevelOrderTreePrint levelOrderTreePrint =new LevelOrderTreePrint();
        levelOrderTreePrint.levelOrder(binaryTree,0);
        for (int key: levelOrderTreePrint.hashMap.keySet()){
            System.out.print(levelOrderTreePrint.hashMap.get(key).get(0));
            System.out.println(levelOrderTreePrint.hashMap.get(key).get(levelOrderTreePrint.hashMap.get(key).size()-1));
        }
    }


    public static void main(String[] args) {
        int[] treeNodeValues = {3, 5, 1, 6, 2, 0, 8, -1, -1, -1, 4};
        TreeConstruction treeConstruction = new TreeConstruction();
        BinaryTree binaryTree = treeConstruction.createTree(treeNodeValues);
        LeftRightViewTree leftViewTree = new LeftRightViewTree();
        System.out.println("Left tree");
        leftViewTree.printLeftView(binaryTree);
        System.out.println("Right tree");
        leftViewTree.printRightView(binaryTree);
        System.out.println("Top tree");
        leftViewTree.topView(binaryTree);
    }
}
