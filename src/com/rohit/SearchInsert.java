package src.com.rohit;

import java.util.HashSet;
import java.util.Set;

/**
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 */
public class SearchInsert {

    public static void main(String[] args) {
        final int r = 9;

        int[] nums = {1,3,5,6};
        int target = 7;
       int ans = searchInsert(nums,target);
        System.out.println("ans = " + ans);
    }
//
//    public static int searchInsert(int[] nums, int target) { //target = 2
//        if (nums.length <1)
//            return -1;
//
//        for(int i = 0; i < nums.length ; i++){
//            if(nums[i] == target){
//                return i;
//            }
//            if(nums[i] > target && i < nums.length) {
//                return i;
//            }
//            if (i == nums.length-1) {
//
//                return i+1;
//            }
//
//        }
//        return -1;
//    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                high = mid-1;
            else
                low = mid+1;
        }
        return low;
    }
    }
