package com.java.practise.trie;

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

    public boolean checkStringExist(String checkString, Trie trie) {
        for (int i = 0; i < checkString.length(); i++) {
            char currentChar = checkString.charAt(i);
            if (trie.characterTrieMap.get(currentChar) == null) {
                return false;
            }
            trie = trie.characterTrieMap.get(currentChar);
        }
        return (trie.isEnd) ? Boolean.TRUE : Boolean.FALSE;
    }

    public Trie getTryRoot(String[] listString) {
        Trie trie = new Trie();
        TrieExample trieExample = new TrieExample();
        for (String str : listString) {
            trieExample.insertTheNode(str, trie);
        }
        return trie;
    }

    public static void main(String[] args) {
        TrieExample trieExample = new TrieExample();
        String[] listString = {"where", "why", "dharmu", "sunatu", "sunita"};
        Trie tryRoot = trieExample.getTryRoot(listString);
        System.out.println("Trie : " + trieExample.checkStringExist("sunatua", tryRoot));
    }
}
