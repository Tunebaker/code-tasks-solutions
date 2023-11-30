package leetcode._35.SearchInsertPosition;

public class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 3;
        System.out.println("Result is " + new Solution().searchInsert(nums, target));
    }
}
