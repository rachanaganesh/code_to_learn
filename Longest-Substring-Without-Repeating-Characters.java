class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length(), i = 0, j = 0, res = 0;
        Set<Character> set = new HashSet<>();
        char[] arr = s.toCharArray();
        
        while(i<length && j<length){`
            if(!set.contains(arr[j])){
                set.add(arr[j++]);
                res = Math.max(res, j-i);
            }
            else {
                set.remove(arr[i++]);
            }
             System.out.println(set);
        }
         return res;
    }
}