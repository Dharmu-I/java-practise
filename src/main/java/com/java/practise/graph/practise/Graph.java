package com.java.practise.graph.practise;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    int vertices;
    LinkedList<Integer> graph [];

    public Graph(int v){
        this.vertices = v;
        graph = new LinkedList[v];
        for (int i = 0; i < v; i++){
            graph[i] = new LinkedList<>();
        }
    }

    public void addEdge(int verticeOne, int verticeTwo){
        graph[verticeOne].add(verticeTwo);
    }


    public void bfsOfGraph(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        boolean[] visited = new boolean[vertices];
        visited[start] = true;
        while (!queue.isEmpty()){
            Integer removedNumber = queue.poll();
            System.out.println(removedNumber);
            while (!graph[removedNumber].isEmpty()) {
                int numberToQueue = graph[removedNumber].removeFirst();
                if (!visited[numberToQueue]) {
                    queue.add(numberToQueue);
                    visited[numberToQueue] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(2,3);
        graph.addEdge(3,3);
        graph.bfsOfGraph(0);
    }
}
