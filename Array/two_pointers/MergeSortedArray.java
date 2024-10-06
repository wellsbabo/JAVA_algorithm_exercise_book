package Array.two_pointers;

import java.util.*;

public class MergeSortedArray {
    public static void main(String args[]){
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = new int[]{2,5,6};
        int n = 3;

        merge(nums1, m, nums2, n);

        System.out.print("result = [ ");
        for(int num: nums1){
            
            System.out.print(num + " ");
        }
        System.out.print("]");
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new LinkedList<>();
        
        int point1 = 0;
        int point2 = 0;

        while(point1 < m && point2 < n){
            if(nums1[point1] <= nums2[point2]){
                list.add(nums1[point1++]);
                // point1++;
            }else{
                list.add(nums2[point2++]);
                // point2++;
            }
        }
        if(point1 < m){
            while(point1 < m){
                list.add(nums1[point1++]);
            }
        }
        if(point2 < n){
            while(point2 < n){
                list.add(nums2[point2++]);
            }
        }

        // nums1 = list.stream().mapToInt(Integer::intValue).toArray();

        int i = 0;
        for(int num : list){
            nums1[i] = num;
            i++;
        }
    }

}
