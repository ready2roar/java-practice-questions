package src.com.rohit;

import java.util.Arrays;

public class findMedianSortedArrays {
    public static void main(String[] args) {

       int[] nums1 = {1,3};
       int[] nums2 = {2,4};

        System.out.println(method(nums1,nums2));
    }


    public static double method(int[] num1, int[] num2) {
        double value;
        int[] arr = new int[num1.length + num2.length];
        int i;
        for (i = 0; i < num1.length; i++) {
            arr[i] = num1[i];
        }
        for (int j = 0; j < num2.length; j++) {
            arr[i] = num2[j];
            i++;
        }

        Arrays.sort(arr);


        int index = arr.length/2;
        if(arr.length % 2 == 0){
            value = arr[arr.length/2];
            System.out.println(arr[index]);
            System.out.println(arr[index-1]);
            System.out.println(value);
        }
        else {
            value = (arr[arr.length/2] + arr[(arr.length-1)/2])/2.0;

        }

        return value;
    }
}
