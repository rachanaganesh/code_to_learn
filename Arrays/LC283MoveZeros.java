package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LC283MoveZeros {
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0) {
                nums[index] = nums[i];
                index++;
            }
            System.out.println(nums[i]);
        }
        for(int i=index;i<nums.length;i++) {
            if(index<nums.length){
                nums[index]=0;
            }
            System.out.println(nums[i]);
        }

    }

    public static void main(String[] args) {
        LC283MoveZeros zeros = new LC283MoveZeros();
        int[] arr = {0,1,0,3,12};
        zeros.moveZeroes(arr);
    }
}
