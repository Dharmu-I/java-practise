package com.java.practise.tree;

import java.util.HashMap;
import java.util.Map;

class Trie {
    boolean isEnd;
    Map<Character, Trie> characterTrieMap = new HashMap<>();
}

public class TrieExample {

    public void insertTheNode(String stringToStore, Trie trie) {
        for (int i = 0; i < stringToStore.length(); i++) {
            char currentChar = stringToStore.charAt(i);
            if (trie.characterTrieMap.get(currentChar) == null) {
                trie.characterTrieMap.put(currentChar, new Trie());
            }
            trie = trie.characterTrieMap.get(currentChar);
        }
        trie.isEnd = Boolean.TRUE;
    }

    public boolean checkStringExist(String checkString, Trie trie){
        for (int i = 0; i < checkString.length(); i++) {
            char currentChar = checkString.charAt(i);
            if (trie.characterTrieMap.get(currentChar) == null){
                return false;
            }
            trie = trie.characterTrieMap.get(currentChar);
        }
        return (trie.isEnd)? Boolean.TRUE:Boolean.FALSE;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        TrieExample trieExample = new TrieExample();
        String[] listString = {"where", "why", "dharmu", "sunatu", "sunita"};
        for (String str: listString) {
            trieExample.insertTheNode(str, trie);
        }
        System.out.println("Trie : "+trieExample.checkStringExist("sunatua", trie));
    }
}
