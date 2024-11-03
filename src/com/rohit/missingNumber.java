package src.com.rohit;

public class missingNumber {

    public static int missingNumber(int n, int[] arr)
    {
        // Create hash array of size n+1
        int[] hash = new int[n + 1];

        // Store frequencies of elements
        for (int i = 0; i < n - 1; i++) {
            hash[arr[i]]++;
        }

        // Find the missing number
        for (int i = 1; i <= n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }

        // Edge case handling (though problem guarantees a
        // solution)
        return -1;
    }


    public static int missingNumber1(int n, int[] arr) {
        int first = arr[0];
        int last = first + n - 1;

        int expectedSum = n * (first + last  ) /2;


        int actualSum = 0;

        for (int num : arr) {
            actualSum = actualSum + num;
        }

        return expectedSum - actualSum;

    }


    public static void missingNumber2(int[] arr, int n) {

        int[] hash = new int[n];

        for(int i = 0 ; i < arr.length-1; i++) {
            hash[arr[i]]++;
        }

        for(int i = 1; i < hash.length ; i ++) {
            if(hash[i] == 0){
                System.out.println(i);
            }
        }

    }

    public static void main(String[] args)
    {
        int[] arr = { 11, 12, 13, 15 };
        int[] arr1 = { 1, 2, 3, 5 };
        int n = 5;
//        System.out.println(missingNumber(n, arr));
 //       System.out.println(missingNumber1(n, arr));
        missingNumber2( arr1, n);
    }

}
