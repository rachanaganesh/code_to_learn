package Tries;

import sun.text.normalizer.Trie;

import java.util.*;

public class productSuggestion {
    public TrieNode root;

    public List<String> productList(String[] repo, String customerQuery){
       int len = customerQuery.length();
        root = new TrieNode();
        for(String str : repo) {
            add(str);
        }
        for(int i = len-3; i <= len ; i++){
            search(customerQuery.substring(0,i));
        }

        return null;
    }

    public void add(String str) {
        TrieNode curr = root;
        for(char c:str.toCharArray()){
            TrieNode next = curr.children.get(c);
            if(next == null){
                next = new TrieNode();
                curr.children.put(c,next);
            }
            next.queue.offer(str);
            if(next.queue.size()>3){
                next.queue.poll();
            }
            curr = next;
        }
    }

    public List<String> search(String s) {
        List<String> res = new ArrayList<>();
        TrieNode p = root;
        for(char c : s.toCharArray()){
            TrieNode child = p.children.get(c);
            if(child == null) {
                return new ArrayList<>();
            }
            p = child;
        }
        PriorityQueue<String> pq = new PriorityQueue<>(p.queue);
        int cnt = 0;
        while(!pq.isEmpty() && cnt < 3){
            res.add(0,pq.poll());
        }
        System.out.println(res.toString());
        return res;
    }



    public class TrieNode{
     //   1. a priority queue storing products sorted in reverse alphabetical order
     //* 2. a map associating lowercase characters to TrieNodes
        Map<Character,TrieNode> children;
        Queue<String> queue;
        public TrieNode(){
            this.children = new HashMap<Character,TrieNode>();
            this.queue = new PriorityQueue<>((a,b) -> b.toLowerCase().compareTo(a.toLowerCase()));
        }
    }

    public static void main(String[] args) {
        int numProducts = 5;
        String[] repository = {"mon", "mouse", "moneypot", "monitor", "mousepad"};
        String userInput = "moneypot";
        productSuggestion product = new productSuggestion();
        product.productList(repository, userInput);
    }
}
