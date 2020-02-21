package com.java.practise.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class SimpleGraphBFS {

    private LinkedList<Integer> adjacencies[];
    private boolean visited[];

    SimpleGraphBFS(int v){
        adjacencies = new LinkedList[v];
        visited = new boolean[v];
        for (int i=0;i < v; i++){
            adjacencies[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w){
        adjacencies[v].add(w);
    }

    void BFS(int start){

        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int s = queue.poll();
            System.out.println(s + " ");
            Iterator<Integer> integerIterator = adjacencies[s].listIterator();
            while (integerIterator.hasNext()) {
                Integer n = integerIterator.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        SimpleGraphBFS simpleGraph =  new SimpleGraphBFS(4);
        simpleGraph.addEdge(0,1);
        simpleGraph.addEdge(0,2);
        simpleGraph.addEdge(1,2);
        simpleGraph.addEdge(2,0);
        simpleGraph.addEdge(2,3);
        simpleGraph.addEdge(3,3);
        simpleGraph.BFS(2);
    }

}
