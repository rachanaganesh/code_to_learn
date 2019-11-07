package classes;

public class isAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] count = new int[128];

        for(int i =0;i<s.length();i++) {
            int charr1 = s.charAt(i);
            int charr2 = t.charAt(i);

            count[charr1]++;
            count[charr2]--;

            for(int j=0;j<count.length;j++){
                System.out.println(count[j]);
                if(count[j]!=0) return false;
            }
        }


        return true;

    }
    public static void main(String[] args) {
       // System.out.println(new isAnagram("anagram","naagram"));

    }
}
