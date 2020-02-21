package com.java.practise.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class RouteBetweenTwoNodes {

    private LinkedList<Integer> adjacencies[];
    private boolean visited[];

    RouteBetweenTwoNodes(int v){
        adjacencies = new LinkedList[v];
        visited = new boolean[v];
        for (int i=0; i<v;i++){
            adjacencies[i] = new LinkedList<>();
        }
    }


    void addEdge(int v, int w){
        adjacencies[v].add(w);
    }

    void BFS(int s, int end){
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;
        while (!queue.isEmpty()){
            int polledNumber  = queue.poll();
            System.out.println(polledNumber+" ");
            if (polledNumber == end){
                System.out.println("found path");
                return;
            }
            Iterator<Integer> nextvalue = adjacencies[polledNumber].listIterator();
            while (nextvalue.hasNext()){
                int nextNumber = nextvalue.next();
                if (!visited[nextNumber]){
                    visited[nextNumber] = true;
                    queue.add(nextNumber);
                }
            }
        }
        System.out.println("Not found any path");
    }

    public static void main(String[] args) {
        RouteBetweenTwoNodes simpleGraph =  new RouteBetweenTwoNodes(4);
        simpleGraph.addEdge(0,1);
        simpleGraph.addEdge(0,2);
        simpleGraph.addEdge(1,2);
        simpleGraph.addEdge(2,0);
        simpleGraph.addEdge(2,3);
        simpleGraph.addEdge(3,3);
        simpleGraph.BFS(2,1);
    }
}
