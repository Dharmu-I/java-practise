package com.java.practise.graph;

import java.util.*;

public class RouteBetweenNodes {

    private Map<Integer,List<Integer>> vertices;
    private boolean visited[];

    RouteBetweenNodes(int v){
        vertices = new HashMap<>();
        visited = new boolean[v];
    }

    private void addNode(int v, int w){
        if (vertices.get(v) == null){
            List<Integer> integerList = new ArrayList<>();
            integerList.add(w);
            vertices.put(v,integerList);
        }else {
            vertices.get(v).add(w);
        }
    }

    private boolean pathExist(int node1, int node2){
        List<Integer> integerList = new ArrayList<>();
        if (vertices.get(node1) == null){
            return false;
        }
        integerList.add(node1);
        while (!integerList.isEmpty()){
            Integer removedValue = integerList.remove(0);
            if (!visited[removedValue]){
                visited[removedValue] = true;
                List<Integer> integerList1 = vertices.get(removedValue);
                if ( integerList1 != null){
                    if (integerList1.contains(node2))
                        return true;
                    integerList.addAll(integerList1);
                }

            }
        }
        return false;
    }

    public static void main(String[] args) {
        RouteBetweenNodes routeBetweenNodes = new RouteBetweenNodes(6);
        routeBetweenNodes.addNode(2,1);
        routeBetweenNodes.addNode(2,3);
        routeBetweenNodes.addNode(2,4);
        routeBetweenNodes.addNode(1,5);
        routeBetweenNodes.addNode(1,2);
        routeBetweenNodes.addNode(5,4);
        routeBetweenNodes.addNode(3,4);
        if (routeBetweenNodes.pathExist(1,3)){
            System.out.println("Found the right path");
        }else {
            System.out.println("No path found");
        }
    }
}
