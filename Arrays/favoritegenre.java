package Arrays;
import  java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class favoritegenre {
    public Map<String,List<String>> FavoriteGenre(Map<String, List<String>> userMap,Map<String, List<String>> songMap){
        Map<String,List<String>> result = new HashMap<>();
        Map<String, String> songInGenre = new HashMap<>();

        for(String genre : songMap.keySet()) {
            List<String> songs = songMap.get(genre);
            for(String song : songs) {
                songInGenre.put(song, genre);
            }
        }
        Map<String,Integer> count = new HashMap<>();
        int max =0;
        for(String user : userMap.keySet()){
            count = new HashMap<>();
            max =0;
            result.put(user,new ArrayList<>());

            List<String> songs = userMap.get(user);
            for(String song: songs) {
                String genre = songInGenre.get(song);
                int c = count.getOrDefault(genre,0)+1;
                count.put(genre,c);
                max = Math.max(max,c);
            }
            for(String res: count.keySet()) {
                if(max == count.get(res)){
                    result.get(user).add(res);
                }
            }
        }
        return result;
    }




    public static void main(String[] args){
        Map<String, List<String>> userMap = new HashMap<>();
        List<String> list1 = Arrays.asList("song1", "song2", "song3", "song4", "song8");
        List<String> list2 = Arrays.asList("song5", "song6", "song7");
        userMap.put("David", list1);
        userMap.put("Emma", list2);

        Map<String, List<String>> genreMap = new HashMap<>();
        List<String> list3 = Arrays.asList("song1", "song3");
        List<String> list4 = Arrays.asList("song7");
        List<String> list5 = Arrays.asList("song2", "song4");
        List<String> list6 = Arrays.asList("song5", "song6");
        List<String> list7 = Arrays.asList("song8", "song9");
        genreMap.put("Rock", list3);
        genreMap.put("Dubstep", list4);
        genreMap.put("Techno", list5);
        genreMap.put("Pop", list6);
        genreMap.put("Jazz", list7);
        favoritegenre genre = new favoritegenre();
        System.out.println(genre.FavoriteGenre(userMap,genreMap));

    }
}
