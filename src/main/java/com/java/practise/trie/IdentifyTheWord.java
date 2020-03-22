package com.java.practise.trie;

import java.util.HashMap;
import java.util.Map;

public class IdentifyTheWord {
    
    /*
    You are running a classroom and suspect that some of your students are passing around the answers to multiple choice questions disguised as random strings.
    
    Your task is to write a function that, given a list of words and a string, finds which word in the list is scrambled up inside the string, if any exists. There will be at most one matching word. The letters don't need to be contiguous.
    
    Example:
    words = ['cat', 'dog', 'bird', 'car', 'ax', 'baby']
    string1 = 'tcabnihjs' -> cat
    string2 = 'tbcanihjs' -> cat
    string3 = 'baykkjl' -> None
    string4 = 'bbabylkkj' -> baby
    */


    public void constructTrie(String[] words, Trie trie) {
        for (String word : words) {
            insertWordInTrie(word, trie);
        }
    }

    public void insertWordInTrie(String word, Trie trie) {
        for (int index = 0; index < word.length(); index++) {
            char currentChar = word.charAt(index);
            if (trie.characterTrieMap.get(currentChar) == null) {
                trie.characterTrieMap.put(currentChar, new Trie());
            }
            trie = trie.characterTrieMap.get(currentChar);
        }
        trie.isEnd = true;
    }

    public String getWord(String[] words, String searchWord) {
        Trie trie = new Trie();
        constructTrie(words, trie);
        return searchWordInTrie(searchWord, trie);
    }

    public String searchWordInTrie(String searchWord, Trie trie) {
        String searchString = "";
        Map<Character, Integer> characterTrieMap = new HashMap<>();
        for (int index = 0; index < searchWord.length(); index++) {
            if (characterTrieMap.get(searchWord.charAt(index)) == null) {
                characterTrieMap.put(searchWord.charAt(index), 1);
            } else {
                characterTrieMap.put(searchWord.charAt(index), characterTrieMap.get(searchWord.charAt(index)) + 1);
            }
        }
        for (int index = 0; index < searchWord.length(); index++) {
            if (trie.characterTrieMap.get(searchWord.charAt(index)) != null) {
                trie = trie.characterTrieMap.get(searchWord.charAt(index));
                //searchWord.replace(searchWord.charAt(index),'');
                searchString += searchWord.charAt(index);
                if (characterTrieMap.get(searchWord.charAt(index)) > 1) {
                    characterTrieMap.put(searchWord.charAt(index), characterTrieMap.get(searchWord.charAt(index)) - 1);
                } else {
                    characterTrieMap.remove(searchWord.charAt(index));
                }
                break;
            }
        }
        while (trie != null && trie.characterTrieMap != null && !trie.characterTrieMap.isEmpty()) {
            if (trie.isEnd) {
                return searchString;
            }
            for (char eachChar : trie.characterTrieMap.keySet()) {
                if (characterTrieMap.get(eachChar) != null) {
                    trie = trie.characterTrieMap.get(eachChar);
                    if (characterTrieMap.get(eachChar) > 1) {
                        characterTrieMap.put(eachChar, characterTrieMap.get(eachChar) - 1);
                    } else {
                        characterTrieMap.remove(eachChar);
                    }
                    searchString += eachChar;
                    if (trie != null && trie.isEnd) {
                        return searchString;
                    }
                    break;
                }
            }

        }

        return "NONE";
    }

    public String getMatchingWord(String[] words, String searchWord){
        Map<Character, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < searchWord.length(); i++){
            if (integerMap.get(searchWord.charAt(i)) == null){
                integerMap.put(searchWord.charAt(i), 1);
            }else {
                integerMap.put(searchWord.charAt(i), integerMap.get(searchWord.charAt(i))+1);
            }
        }
        for (String word : words){
            int index = 0;
            for (; index < word.length(); index++){
                if (integerMap.get(word.charAt(index)) == null){
                    break;
                }else {
                    if (integerMap.get(word.charAt(index)) > 1){
                        integerMap.put(word.charAt(index), integerMap.get(word.charAt(index))-1);
                    }else {
                        integerMap.remove(word.charAt(index));
                    }
                }
            }
            if (index == word.length()){
                return word;
            }else {
                for (int i=0; i < index; i++){
                    if (integerMap.get(word.charAt(i)) == null){
                        integerMap.put(word.charAt(i), 1);
                    }else {
                        integerMap.put(word.charAt(i), integerMap.get(word.charAt(i))+1);
                    }
                }
            }
        }
        return "NONE";
    }

    public static void main(String[] argv) {
        IdentifyTheWord solution = new IdentifyTheWord();
        String[] words = new String[]{"cat", "dog", "bird", "car", "ax", "baby"};
        String string1 = "tcabnihjs";
        String string2 = "tbcanihjs";
        String string3 = "baykkjl";
        String string4 = "bbabylkkj";
     System.out.println(solution.getMatchingWord(words,string1));
     System.out.println(solution.getMatchingWord(words,string2));
     System.out.println(solution.getMatchingWord(words, string3));
     System.out.println(solution.getMatchingWord(words,string4));
    }
}
