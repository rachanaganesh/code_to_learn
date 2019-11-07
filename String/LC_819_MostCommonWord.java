package String;

import java.util.HashMap;

public class LC_819_MostCommonWord {

    public static String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        String[] p = paragraph.toLowerCase().split("[ !?',;.]+");
        for(String word: p){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String word: banned) {
                    if(map.containsKey(word)){
                       map.remove(word);
                    }
        }
        String result = null;
        for(String word: map.keySet()){
            System.out.println(word);
            if(result == null || map.get(word) > map.get(result))
                result = word;
        }
        System.out.println(map);
        return result;
    }

    public static void main(String[] args) {
        String p = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(LC_819_MostCommonWord.mostCommonWord(p, banned));
    }
}
