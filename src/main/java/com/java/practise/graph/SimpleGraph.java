package com.java.practise.graph;

import java.util.LinkedList;

public class SimpleGraph {

    private int numberOfVertises;
    private LinkedList<Integer> adjcencies[];

    SimpleGraph(int v){
        this.numberOfVertises = v;
        adjcencies = new LinkedList[v];
        for (int i=0;i<v;i++){
            adjcencies[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w){
        adjcencies[v].add(w);
    }

    void BFS(int s)
    {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(s);
        while (!queue.isEmpty())
        {
            s = queue.poll();
            System.out.print(s+" ");
            LinkedList<Integer> i = adjcencies[s];
            while (!i.isEmpty())
            {
                int n = i.element();
                queue.add(n);
                i.remove(i.element());
            }
        }
    }

    public static void main(String[] args) {
        SimpleGraph simpleGraph =  new SimpleGraph(6);
        simpleGraph.addEdge(0,1);
        simpleGraph.addEdge(0,2);
        simpleGraph.addEdge(1,3);
        simpleGraph.addEdge(2,4);
        simpleGraph.addEdge(3,5);
        simpleGraph.BFS(0);
    }

}
