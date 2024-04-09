package src.com.rohit;

import java.util.ArrayList;
import java.util.Scanner;

public class SubArrayWithGivenSum {
    /**
     * Input:
     * N = 5, S = 12
     * A[] = {1,2,3,7,5}
     * Output: 2 4
     * Explanation: The sum of elements
     * from 2nd position to 4th position
     * is 12.
     * <p>
     * <p>
     * Example 2:
     * <p>
     * Input:
     * N = 10, S = 15
     * A[] = {1,2,3,4,5,6,7,8,9,10}
     * Output: 1 5
     * Explanation: The sum of elements
     * from 1st position to 5th position
     * is 15.
     */


    public static void main(String[] args) {
       int n = 42, s = 468;
       int arr[] = {135,101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37,192,5, 103, 154, 93, 183,
               22, 117, 119, 96, 48, 127, 172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};

//       int n = 4, s = 0 ;
//       int arr[] = {1,2,3,4};
        System.out.println(subarraySum(arr,n,s));

    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> indexes = new ArrayList<>();

        int start = 0, result = 0;
        if(s==0) {
            indexes.add(-1);
            return indexes;
        }

        for (int i = 0; i < arr.length; i++) {

            result = result + arr[i];
            if (result == s) {
                indexes.add(++start);
                indexes.add(++i);
                return indexes;
            }
            while (result > s) {
                result = result - arr[start];
                start++;
                if (result == s) {
                    indexes.add(++start);
                    indexes.add(++i);
                    return indexes;
                }
            }

        }
        indexes.add(-1);
        return indexes;
    }
}
