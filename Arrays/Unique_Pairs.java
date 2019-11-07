package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Unique_Pairs {
        public  int pairs(int[] nums, int target){
            Set<Integer> set = new HashSet<>();
            Set<Integer> seen = new HashSet<>();
            int count =0;
            for(int num:nums) {
                if (set.contains(target - num) && !seen.contains(num)){
                    count++;
                    seen.add(target-num);
                    seen.add(num);
                }else if(!set.contains(num)){
                    set.add(num);
                }
            }
            return count;
        }
    public static void main(String[] args){
        Unique_Pairs pairs = new Unique_Pairs();
        int [] nums = {1, 1, 2, 45, 46, 46};
        System.out.println(pairs.pairs(nums,47));

    }
}
