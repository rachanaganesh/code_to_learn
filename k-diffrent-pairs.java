class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0;
        Arrays.sort(nums);
        int left = 0, right = 1, ret = 0;
        while (right < nums.length) {
            if (nums[right] - nums[left] > k) {
                left++;
            } else if (left == right || nums[right] - nums[left] < k) {
                right++;
            } else {
                ret++;
                left++;
                right++;
                while (right < nums.length && nums[right] == nums[right-1]) {
                    right++;
                }
            }
        }
        return ret;
    }
}