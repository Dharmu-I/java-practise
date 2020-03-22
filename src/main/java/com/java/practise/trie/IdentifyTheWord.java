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
        TrieExample trieExample = new TrieExample();
        for (String word : words) {
            trieExample.insertTheNode(word, trie);
        }
    }

    public String getWord(String[] words, String searchWord) {
        Trie trie = new Trie();
        constructTrie(words, trie);
        return searchWordInTrie(searchWord, trie);
    }

    public String searchWordInTrie(String searchWord, Trie trie) {
        StringBuilder searchString = new StringBuilder(searchWord);
        StringBuilder resultString = new StringBuilder();
        Trie dupTrie = trie;
        int searchIndex = 0;
        while (searchIndex < searchString.length()) {
            if (trie != null && trie.isEnd) {
                return resultString.toString();
            }
            if (trie != null && trie.characterTrieMap.get(searchString.charAt(searchIndex)) != null) {
                resultString.append(searchString.charAt(searchIndex));
                trie = trie.characterTrieMap.get(searchString.charAt(searchIndex));
                searchString.deleteCharAt(searchIndex);
                searchIndex = 0;
            } else {
                searchIndex++;
            }
        }
        if (trie != null && trie.isEnd) {
            return resultString.toString();
        }
        return "NONE";
    }

    public String getMatchingWord(String[] words, String searchWord) {
        Map<Character, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < searchWord.length(); i++) {
            if (integerMap.get(searchWord.charAt(i)) == null) {
                integerMap.put(searchWord.charAt(i), 1);
            } else {
                integerMap.put(searchWord.charAt(i), integerMap.get(searchWord.charAt(i)) + 1);
            }
        }
        for (String word : words) {
            int index = 0;
            for (; index < word.length(); index++) {
                if (integerMap.get(word.charAt(index)) == null) {
                    break;
                } else {
                    if (integerMap.get(word.charAt(index)) > 1) {
                        integerMap.put(word.charAt(index), integerMap.get(word.charAt(index)) - 1);
                    } else {
                        integerMap.remove(word.charAt(index));
                    }
                }
            }
            if (index == word.length()) {
                return word;
            } else {
                for (int i = 0; i < index; i++) {
                    if (integerMap.get(word.charAt(i)) == null) {
                        integerMap.put(word.charAt(i), 1);
                    } else {
                        integerMap.put(word.charAt(i), integerMap.get(word.charAt(i)) + 1);
                    }
                }
            }
        }
        return "NONE";
    }

    public String getWordSolutionTwo(String[] words, String searchWord) {
        for (String word : words) {
            StringBuilder stringBuilder = new StringBuilder(searchWord);
            for (int index = 0; index < word.length(); index++) {
                int inIndex = 0;
                while (inIndex < stringBuilder.length()) {
                    if (word.charAt(index) == stringBuilder.charAt(inIndex)) {
                        stringBuilder.deleteCharAt(inIndex);
                        break;
                    } else {
                        inIndex++;
                    }
                }
            }
            if (searchWord.length() - stringBuilder.length() == word.length()) {
                return word;
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
        System.out.println(solution.getMatchingWord(words, string1));
        System.out.println(solution.getMatchingWord(words, string2));
        System.out.println(solution.getMatchingWord(words, string3));
        System.out.println(solution.getMatchingWord(words, string4));

        System.out.println(solution.getWordSolutionTwo(words, string1));
        System.out.println(solution.getWordSolutionTwo(words, string2));
        System.out.println(solution.getWordSolutionTwo(words, string3));
        System.out.println(solution.getWordSolutionTwo(words, string4));

//        System.out.println(solution.getWord(words, string1));
        System.out.println(solution.getWord(words, string2));
//        System.out.println(solution.getWord(words, string3));
//        System.out.println(solution.getWord(words, string4));
    }
}
