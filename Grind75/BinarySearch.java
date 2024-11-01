package Grind75;

public class BinarySearch{
    public static void main(String[] args){
        int result = search(new int[]{-1,0,3,5,9,12}, 12);
        System.out.println("result = " + result);
    }

    public static int search(int[] nums, int target) {
        // return quickSearch(nums, 0, nums.length-1, target);
        int start = 0;
        int end = nums.length-1;
        

        while(start <= end){
            int mid = (end + start)/2;

            if(nums[mid] == target){
                return mid;
            }

            else if(nums[mid] < target){
                start = mid + 1;
            }

            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    // public static int quickSearch(int[] nums, int start, int end, int target){
    //     int length = end - start + 1;
        
    //     if(length/2 + start < 0 || length/2 + start >= nums.length){
    //         return -1;
    //     }

    //     if(start == end && nums[start] != target){
    //         return -1;
    //     }

    //     System.out.println(start + " / " + end + " / " + target);
    //     if(nums[length/2 + start] == target){
    //         return length/2 + start;
    //     }
    //     else if(nums[length/2 + start] < target){
    //         return quickSearch(nums, length/2+start+1, end, target);
    //     }else{
    //         return quickSearch(nums, start, length/2-1+start, target);
    //     }
    // }
}