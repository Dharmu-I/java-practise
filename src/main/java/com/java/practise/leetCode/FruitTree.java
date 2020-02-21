package com.java.practise.leetCode;

import java.util.*;

/**
 * dharmu.i on 22/03/19
 */

public class FruitTree {

    public int totalFruit(int[] tree) {
        HashMap<String, List<Integer>> basket = new HashMap<>();
        String key = null;
        int max = 0;

        for (int i=0; i < tree.length-1; i++){
            for (int j = i+1; j < tree.length;j++){
                if (basket.size() == 0){
                    List<Integer> integers = new ArrayList<>();
                    integers.add(tree[i]);integers.add(tree[j]);
                    key = tree[i]+"_"+tree[j];
                    basket.put(key,integers);

                }else if (basket.get(key).contains(tree[j])){
                    basket.get(key).add(tree[j]);
                }else {
                    for(String keys: basket.keySet()){
                        System.out.println("List : "+basket.get(keys).toString());
                        if (max < basket.get(keys).size()){
                            max = basket.get(keys).size();
                        }
                    }
                    basket = new HashMap<>();
                    key = null;
                    break;
                }
            }
            for(String keys: basket.keySet()){
                System.out.println("List : "+basket.get(keys).toString());
                if (max < basket.get(keys).size()){
                    max = basket.get(keys).size();
                }
            }
            basket = new HashMap<>();
            key = null;
        }

        return max;
    }

    public static void main(String[] args) {
        int[] tree = {0,0,1,1};
        FruitTree fruitTree = new FruitTree();
        System.out.println(fruitTree.totalFruit(tree));
    }
}
