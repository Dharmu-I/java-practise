package com.java.practise.leetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * dharmu.i on 22/03/19
 */

public class FruitTreeNew {

    public static int totalFruit(int[] tree) {
        List<Integer> fruitBasket = new ArrayList<>();
        Integer basketOneNumber;
        Integer basketTwoNumber = null;
        Integer max = 0;

        if (tree.length < 2){
            return tree.length;
        }

        for (int i=0; i < tree.length-1;i++){
            basketOneNumber = tree[i];
            fruitBasket.add(tree[i]);
            for (int j=i+1;j<tree.length;j++){
                if (basketOneNumber != tree[j] && basketTwoNumber == null){
                    basketTwoNumber = tree[j];
                    fruitBasket.add(tree[j]);
                }else if (basketTwoNumber!= null && basketTwoNumber == tree[j]){
                    fruitBasket.add(tree[j]);
                }else if (tree[j] == basketOneNumber || tree[j] == basketTwoNumber){
                    fruitBasket.add(tree[j]);
                }else {
                    break;
                }
            }
            if (max < fruitBasket.size()){
                max = fruitBasket.size();
            }
            System.out.println("Fruit List : "+fruitBasket.toString());
            basketTwoNumber = null;
            fruitBasket = new ArrayList<>();
        }

        return max;
    }

    public static void main(String[] args) {
        int[] trees = {0,0,0,0};
        System.out.println("Size of the tree : "+totalFruit(trees));
    }
}
