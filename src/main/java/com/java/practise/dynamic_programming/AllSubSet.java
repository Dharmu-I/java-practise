package com.java.practise.dynamic_programming;

public class AllSubSet {
    static void printSubsets(int set[])
    {
        int n = set.length;
        int iValue = (1<<n);
        for (int i = 0; i < iValue; i++)
        {
            System.out.println("{ ");
            for (int j = 0; j < n; j++) {
                int val = 1 << j;
                if ((i & val) > 0) {
                    System.out.println(set[j] + " ");
                }
            }
            System.out.println("}");
        }
    }

    public static void main(String[] args)
    {
        int set[] = {1,2};
        printSubsets(set);
    }
}
