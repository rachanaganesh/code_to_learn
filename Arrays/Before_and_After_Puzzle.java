package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Before_and_After_Puzzle {

    public List<String> puzzle(List<String> phrase){
        List<String>res = new ArrayList<>();
        HashMap<String,List<Integer>> map = new HashMap<>();
        for(int i=0;i<phrase.size();i++){
            String str = phrase.get(i);
            String firstWord = str.substring(0,str.indexOf(' '));
            map.putIfAbsent(firstWord, new ArrayList<>());
            map.get(firstWord).add(i);
        }

        for(int i =0; i< phrase.size();i++){
            String str = phrase.get(i);
            String lastWord = str.substring(str.lastIndexOf(' ')+1);
           if(map.containsKey(lastWord)){
               List<Integer> indexes = map.get(lastWord);
               for(Integer index: indexes) {
                   if(i != index) {
                       String temp = phrase.get(index);
                       res.add(str + temp.substring(temp.indexOf(' ')));
                   }
               }
           }
        }
            return  res;
    }
    public static void main(String[] args) {
       List<String> phrase = new ArrayList<String>();
       phrase.add("mission statement");
       phrase.add("a quick bite to eat");
        phrase.add("a chip off the old block");
        phrase.add("chocolate bar");
        phrase.add("mission impossible");
        phrase.add("a man on a mission");
        phrase.add("block party");
        phrase.add("eat my words");
        phrase.add("bar of soap");

       Before_and_After_Puzzle cities = new Before_and_After_Puzzle();

        System.out.println(cities.puzzle(phrase));
    }
}
