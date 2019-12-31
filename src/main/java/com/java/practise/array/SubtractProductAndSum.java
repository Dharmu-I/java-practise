package com.java.practise.array;

public class SubtractProductAndSum {

    public int subtractProductAndSum(int n) {
        int product = -1;
        int sum = 0;
        while (n >= 10){
            int reminder = n % 10;
            sum += reminder;
            n = n/10;
            if (product >= 0){
                product *= reminder;
                continue;
            }
            product = reminder;
        }
        sum += n;
        if (product >= 0){
            product *= n;
        }else {
            product = n;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        SubtractProductAndSum subtractProductAndSum =  new SubtractProductAndSum();
        System.out.println(subtractProductAndSum.subtractProductAndSum(234));
        System.out.println(subtractProductAndSum.subtractProductAndSum(0));
        System.out.println(subtractProductAndSum.subtractProductAndSum(1));
        System.out.println(subtractProductAndSum.subtractProductAndSum(705));
        System.out.println(subtractProductAndSum.subtractProductAndSum(690));
    }
}
