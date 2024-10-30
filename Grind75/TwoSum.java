package Grind75;

import java.util.*;

class Solution {

    public static void main(String[] args){
        twoSum(new int[]{3,2,3}, 6);
    }

    // 이중 반복문을 활용한 방식
    // public static int[] twoSum(int[] nums, int target) {
    //     int start=0;
    //     int end=0;

    //     for(int i=0; i<nums.length-1; i++){
    //         for(int j=i+1; j<nums.length; j++){
    //             if(nums[i] + nums[j] == target){
    //                 start = i;
    //                 end = j;
    //                 break;
    //             }
    //         }
    //     }

    //     System.out.println("start: " + start);
    //     System.out.println("end: " + end);
    //     return new int[]{start,end};
    // }

    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int find = target - nums[i];

            if(map.containsKey(find)){
                System.out.println("start: " + map.get(find));
                System.out.println("end: " + i);
                return new int[]{map.get(find), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{0,0};
    }
}
