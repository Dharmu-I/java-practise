package com.java.practise.trie;

public class FindLongestDictionaryWord {

    private static String getLongestDicString(String s, Trie root) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (root != null && root.characterTrieMap != null && root.characterTrieMap.get(currentChar) != null) {
                stringBuilder.append(currentChar);
                root = root.characterTrieMap.get(currentChar);
            }
        }
        if (root != null && root.isEnd) {
            return stringBuilder.toString();
        }
        return null;
    }

    public static void main(String[] args) {
        String[] strings = {"ale", "apple", "monkey", "plea"};
        TrieExample trieExample = new TrieExample();
        Trie tryRoot = trieExample.getTryRoot(strings);
        System.out.println(getLongestDicString("abpcplea", tryRoot));
    }
}
