package com.java.practise.linked_list;

import java.util.LinkedList;

public class GraphUsingLinkedList {

    private LinkListNode adj[];
    private boolean visited[];

    GraphUsingLinkedList(int v){
        adj = new LinkListNode[v];
        visited = new boolean[v];
        for (int i=0; i< v;i++){
            adj[i] = new LinkListNode(-1);
        }
    }

    void addEdge(int v, int w){
        LinkListNode linkListNodes = adj[v];

        while (linkListNodes.value != -1 && linkListNodes.node != null){
            linkListNodes = linkListNodes.node;
        }

        if (linkListNodes.value == -1 && linkListNodes.node == null) {
            linkListNodes.value = w;
        }else if (linkListNodes.value != -1 && linkListNodes.node == null) {
            linkListNodes.node = new LinkListNode(w);
        }else {
            System.out.println("problematic");
        }
    }

    void BFS(int start){
        LinkedList<LinkListNode> queue = new LinkedList<>();
        queue.add(adj[start]);
        visited[start] = true;
        System.out.println(start);
        while (!queue.isEmpty()){
            LinkListNode linkListNode = queue.poll();
            System.out.println(linkListNode.value);
            LinkListNode linkListNode1 = adj[linkListNode.value];
            while (linkListNode1 != null && linkListNode1.value != -1){
                if (!visited[linkListNode1.value]){
                    visited[linkListNode1.value] = true;
                    queue.add(linkListNode1.node);
                }
                linkListNode1 = linkListNode1.node;
            }
        }

    }

    public static void main(String[] args) {
        GraphUsingLinkedList graphUsingLinkedList = new GraphUsingLinkedList(4);
        graphUsingLinkedList.addEdge(0,1);
        graphUsingLinkedList.addEdge(0,2);
        graphUsingLinkedList.addEdge(1,2);
        graphUsingLinkedList.addEdge(2,0);
        graphUsingLinkedList.addEdge(2,3);
        graphUsingLinkedList.addEdge(3,3);
        graphUsingLinkedList.BFS(0);
        System.out.println("Hello");
    }
}
