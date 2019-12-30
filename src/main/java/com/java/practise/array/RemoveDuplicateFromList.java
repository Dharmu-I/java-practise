package com.java.practise.array;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateFromList {

    public List<Integer> refinedList(List<Integer> input){
        int index = 0;
        int lastMatch = -1;
        while (index < input.size()){
            if (index + 1 < input.size() && (input.get(index).equals(input.get(index+1)))){
                lastMatch = input.get(index);
                input.remove(index+1);
                input.remove(index);
            } else if (lastMatch == input.get(index)){
                input.remove(index);
            }else {
                index++;
            }
        }
        return input;
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(23);integerList.add(28);integerList.add(28);integerList.add(35);integerList.add(49);
        integerList.add(49);integerList.add(53);integerList.add(53);
        System.out.println("Before "+integerList.toString()+" after "
                +new RemoveDuplicateFromList().refinedList(integerList));
        List<Integer> integerListNew = new ArrayList<Integer>();
        integerListNew.add(11);integerListNew.add(11);integerListNew.add(11);integerListNew.add(11);
        integerListNew.add(75);integerListNew.add(75);
        System.out.println("Before "+integerListNew.toString()+" after "
                +new RemoveDuplicateFromList().refinedList(integerListNew));
    }
}
