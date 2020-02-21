package com.java.practise.leetCode;

/**
 * dharmu.i on 25/03/19
 */

public class ReverseStringRemoveEndSpaces {
    public String reverseWords(String s) {

        String[] stringArray = s.split(" ");
        String newString = null;
        for (String s1: stringArray){
            if (!s1.isEmpty()){
                if(newString != null){
                    newString = newString+" "+s1;
                }else{
                    newString = s1;
                }
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        ReverseStringRemoveEndSpaces reverseStringRemoveEndSpaces = new ReverseStringRemoveEndSpaces();
        System.out.println(reverseStringRemoveEndSpaces.reverseWords(s));
    }
}
