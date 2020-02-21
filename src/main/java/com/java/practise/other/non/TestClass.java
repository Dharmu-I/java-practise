package com.java.practise.other.non;

import java.io.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {   int n = Integer.parseInt(br.readLine().trim());
            String[] arr_S = br.readLine().split(" ");
            int[] S = new int[n];
            for(int i_S=0; i_S<arr_S.length; i_S++)
            {
                S[i_S] = Integer.parseInt(arr_S[i_S]);
            }
            int[] out_ = solve(S,n);
            wr.print(out_[0]);
            for(int i_out_=1; i_out_<out_.length; i_out_++)
            {
                wr.print(" " + out_[i_out_]);
            }
            wr.println() ;
        }
        wr.close();
        br.close();
    }
    static int[] solve(int[] S,int n){
        // Your Code Here
        while (n >= 1){
            int counter = 0;
            for (int i=0;i < S.length;i++){
                if (S[i] > S[i+1]){
                    counter++;
                }
            }
            System.out.println(counter);
            n--;
        }

        return null;
    }
}
