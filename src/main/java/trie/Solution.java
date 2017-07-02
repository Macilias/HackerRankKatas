package trie;

import java.util.*;

public class Solution {

    Trie trie = new Trie();

    public void add(String name) {
        trie.add(name);
    }

    public int find(String name) {
        return trie.find(name);
    }

    class Trie {

        TrieNode start = new TrieNode('*');

        public void add(String name) {
            name = name + "*";
            TrieNode current = start;
            for (int i = 0; i < name.length(); i++) {
                Character c = name.charAt(i);
                current = current.add(c);
            }
        }

        public int find(String name) {
            TrieNode current = start;
            for (int i = 0; i < name.length(); i++) {
                Character c = name.charAt(i);
                if(current.next.containsKey(c)){
                    current = current.next.get(c);
                } else {
                    return 0;
                }
            }
            return current.getWordCount();
        }

    }

    class TrieNode {

        Character c;
        Map<Character, TrieNode> next;

        public TrieNode (Character c) {
            this.c = c;
            next = new HashMap<>();
        }

        public TrieNode add(Character c) {
            if (next.containsKey(c)) {
                return next.get(c);
            } else {
                TrieNode tn = new TrieNode(c);
                next.put(c, tn);
                return tn;
            }
        }

        public int getWordCount() {
            int count = 0;
            if (next.containsKey('*')) {
                count = 1;
            }
            for(TrieNode tn : next.values()) {
                count = count + tn.getWordCount();
            }
            return count;
        }
    }

    public static Optional<String> runCommand (Solution solution, String op, String contact) {
        switch(op) {
            case "add":  solution.add(contact); return Optional.empty();
            case "find": return Optional.of(String.valueOf(solution.find(contact)));
            default: return Optional.of("Unknown operation " + op);
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            Optional<String> s = Solution.runCommand(solution, op, contact);
            if (s.isPresent()) {
                System.out.println(s.get());
            }
        }
    }
}

