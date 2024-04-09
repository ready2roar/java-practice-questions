package src.com.rohit;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSums {
    public static void main(String[] args) {
      int[] nums = {3,2,4};
       int target = 6;

        int[] a = TwoSums.twoSum(nums,target);
        System.out.println(Arrays.toString(a));

    }

    // Brute- force solution with (O)n*n (O of n square ) complexity.
//    public static int[] twoSum(int[] nums, int target) {
//            for( int i=0; i< nums.length; i++) {
//                for(int j= i+1; j< nums.length; j++) {
//                    int complement = target - nums[i];
//                    if(nums[j] == complement) {
//                        return  new int[] {i,j};
//                    }
//                }
//            }
//
//        throw new IllegalArgumentException("No match found");
//    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        for(int i= 0; i< nums.length; i++) {
            int complement = target - nums[i];
            if( hashMap.containsKey(complement)) {
                return new int[] {
                        hashMap.get(complement), i
                };
            }
            hashMap.put(nums[i],i );
        }
        throw  new IllegalArgumentException("no match found");
    }

}
