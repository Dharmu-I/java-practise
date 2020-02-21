package com.java.practise.graph;

import java.util.*;

public class DirectionalGraphBFS {
    private Map<String,List<String>> vertices;
    private boolean visited[];

    private DirectionalGraphBFS(int v){
        vertices = new HashMap<>();
        visited = new boolean[v];
    }

    private void addVertices(String v, String w){
        if (vertices.get(v) == null){
            List<String> stringList = new ArrayList<>();
            stringList.add(w);
            vertices.put(v,stringList);
        }else {
            vertices.get(v).add(w);
        }
    }

    private void bfsTrace(String input){
       List<String> stringQueue = new ArrayList<String>();
       stringQueue.add(input);
       while (!stringQueue.isEmpty()){
          String queueElement = stringQueue.remove(0);
          if (!visited[Integer.parseInt(queueElement)]){
              System.out.println(queueElement);
              if (vertices.get(queueElement) != null) {
                  stringQueue.addAll(vertices.get(queueElement));
              }
              visited[Integer.parseInt(queueElement)] = true;
          }
       }
    }

    public static void main(String[] args) {
        DirectionalGraphBFS directionalGraphBFS = new DirectionalGraphBFS(6);
        directionalGraphBFS.addVertices("2","1");
        directionalGraphBFS.addVertices("2","3");
        directionalGraphBFS.addVertices("2","4");
        directionalGraphBFS.addVertices("1","5");
        directionalGraphBFS.addVertices("5","4");
        directionalGraphBFS.addVertices("3","4");
        directionalGraphBFS.bfsTrace("2");
    }
}
