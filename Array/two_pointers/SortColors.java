package Array.two_pointers;
/**
 * LeetCode
 * 75. Sort Colors
 * https://leetcode.com/problems/sort-colors/description/
 */

public class SortColors {
    public static void main(String[] args){
        sortColors(new int[]{2,0,1});
    }

    public static void sortColors(int[] nums){
        int len = nums.length;
        int tmp = 0;

        for(int right = len - 1; right > 0; right --){
            for(int left = 0; left < right; left++){
                if(nums[left] > nums[left+1]){
                    tmp = nums[left];
                    nums[left] = nums[left+1];
                    nums[left+1] = tmp;
                }
            }
        }

        for(int num:nums){
            System.out.print(num + " ");
        }
    }
}
