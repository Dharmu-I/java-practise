package com.java.practise.other.non;

/**
 * @author dharmu.i on 2019-08-06
 */

import java.util.Scanner;

class Largest
{
    public static void main (String args[])
    {
        int a, b, c;
        Scanner ob = new Scanner(System.in);
        System.out.println("enter 3 numbers");
        a = ob.nextInt();
        b = ob.nextInt();
        c = ob.nextInt();
        if ((a >= b) && (a >= c))
        {
            System.out.println("largest is" +a);
        }
        else if((b >= a) && (b >= c))
        {
            System.out.println("largest is" +b);
        }
       else
        {
            System.out.println("largest is" +c);
        }
    }
}