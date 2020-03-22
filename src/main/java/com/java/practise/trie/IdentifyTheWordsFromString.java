package com.java.practise.trie;

public class IdentifyTheWordsFromString {

    private static void checkWordExist(String input, TrieHead trieHead) {
    }

    public static void main(String[] args) {
        String input = "leetcode";
        String[] words = {"cats", "dog", "sand", "and", "cat"};
        TrieHead trieHead = new TrieHead(words.length);
        for (int i=0; i < words.length; i++){
            trieHead.chars[i] = words[i].charAt(0);
        }
        checkWordExist(input, trieHead);
    }
}

class TrieHead {
    char[] chars;
    Trie trie = new Trie();

    TrieHead(int length){
        chars = new char[length];
    }
}
