package com.java.practise.tree;

import java.util.*;

public class TreeTopViewNew {

    private static void topViewOfTree(Node root) {
        Map<Integer, Integer> nodeMap = new HashMap<>();
        Queue<VerticalNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(new VerticalNode(0, root));
        while (!nodeQueue.isEmpty()){
            VerticalNode polledNode = nodeQueue.poll();
            if (!nodeMap.containsKey(polledNode.verticalIndex)){
                nodeMap.put(polledNode.verticalIndex, polledNode.node.data);
            }
            if (polledNode.node.left != null){
                nodeQueue.add(new VerticalNode(polledNode.verticalIndex-1, polledNode.node.left));
            }
            if (polledNode.node.right != null){
                nodeQueue.add(new VerticalNode(polledNode.verticalIndex+1, polledNode.node.right));
            }
        }
        for (Integer key : nodeMap.keySet()){
            System.out.println(nodeMap.get(key));
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        topViewOfTree(root);

    }
}

class VerticalNode{
    int verticalIndex;

    public VerticalNode(int verticalIndex, Node node) {
        this.verticalIndex = verticalIndex;
        this.node = node;
    }

    Node node;
}
