package com.java.practise.string;

import java.util.*;

public class CharToDeleteMakeStringAnagram {

    static int makeAnagram(String a, String b) {
        Map<Character,Integer> charMap = new HashMap<>();
        for(int i=0; i < a.length(); i++){
            Character character = a.charAt(i);
            if(charMap.containsKey(character)){
                charMap.put(character, charMap.get(character)+1);
            }else{
                charMap.put(a.charAt(i),1);
            }
        }
        int counter = 0;
        for(int i = 0; i < b.length(); i++){
            if(charMap.containsKey(b.charAt(i))){
                if(charMap.get(b.charAt(i)) == 1){
                    charMap.remove(b.charAt(i));
                }else{
                    charMap.put(b.charAt(i), charMap.get(b.charAt(i))-1);
                }
            }else{
                counter++;
            }
        }
        int mapCharSum = 0;
        for (Character c : charMap.keySet()){
            mapCharSum += charMap.get(c);
        }
        return counter + mapCharSum;
    }

    public static int betterSolution(String a, String b){
        int[] arrays = new int[52];
        for (int i = 0; i < a.length(); i++){
            int index = a.charAt(i)-'a';
            arrays[index]++;
        }
        for (int i = 0; i < b.length(); i++){
            int index = b.charAt(i)-'a';
            arrays[index]--;
        }
        int count = 0;
        for (int i = 0; i < arrays.length; i++){
            count += Math.abs(arrays[i]);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
        System.out.println(betterSolution("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
    }
}
