package com.java.practise.other.non;

import java.util.List;
import java.util.Stack;

class GreedyAlgoToFindMaxRoom {

    public void findMaxNumberOfSlots(List<Integer> startTime,List<Integer> duration){
        Stack<DataValue> integerStack = new Stack<>();
        int counter = 0;
        while (counter < startTime.size()){
            if (integerStack.isEmpty()){
                DataValue dataValue = new DataValue(startTime.get(counter),duration.get(counter));
                counter++;
                continue;
            }

            DataValue dataValue = integerStack.peek();
//            if (dataValue.start+dataValue.end )
        }
    }

    public static void main(String[] args) {

    }

    class DataValue{
        Integer start;

        Integer end;

        DataValue(Integer start, Integer end){
            this.start = start;
            this.end = end;
        }
    }
}