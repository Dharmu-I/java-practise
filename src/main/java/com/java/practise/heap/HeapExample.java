package com.java.practise.heap;

import java.util.LinkedList;
import java.util.Queue;

public class HeapExample {

    public void heapify(Heap heap, int n) {
        Queue<Heap> integerQueue = new LinkedList<>();
        integerQueue.add(heap);
        while (!integerQueue.isEmpty()){
            Heap polledHeap = integerQueue.poll();
            if (n < polledHeap.value){
                int temp = polledHeap.value;
                polledHeap.value = n;
                n = temp;
            }
            if (polledHeap.left == null) {
                polledHeap.left = new Heap(n);
                break;
            }else {
                integerQueue.add(polledHeap);
                integerQueue.add(polledHeap.left);
            }

            if(polledHeap.right == null){
                polledHeap.right = new Heap(n);
                break;
            } else {
                integerQueue.add(polledHeap.right);
            }
        }
    }

    public void insertNodes(int[] nodeValue, Heap heap) {
        for (int i = 1; i < nodeValue.length; i++) {
            heapify(heap, nodeValue[i]);
        }
    }

    public void display(Heap heap) {
        Queue<Heap> integerQueue = new LinkedList<>();
        integerQueue.add(heap);
        while (!integerQueue.isEmpty()) {
            Heap heap1 = integerQueue.poll();
            System.out.println(heap1.value);
            if ((heap1.left != null)) {
                integerQueue.add(heap1.left);
            }
            if (heap1.right != null) {
                integerQueue.add(heap1.right);
            }
        }
    }

    public static void main(String[] args) {
        HeapExample heapExample = new HeapExample();
        int[] values = {3, 8, 6, 5, 2, 4,7,1};
        Heap heap = new Heap(values[0]);
        heapExample.insertNodes(values, heap);
        heapExample.display(heap);
    }


}

class Heap {

    int value;

    Heap left;

    Heap right;

    public Heap(int value) {
        this.value = value;
    }
}
