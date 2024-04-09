package src.com.rohit;

import java.util.*;

public class APClass {


    public static void main(String[] args) {

        long arr1[] = {1, 3, 5, 7};
        long arr2[] = {0, 2, 6, 8, 9};
        int n = arr1.length;
        int m = arr2.length;
        merge(arr1,arr2,n,m);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static void merge(long arr1[], long arr2[], int n, int m) {

        long[] arr = new long[n+m];

        for (int i = 0; i < n; i++) {
            arr[i] = arr1[i];
        }

        for (int j = 0; j < m; j++) {
            arr[n+j] = arr2[j];
        }
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            arr1[i]=arr[i];
        }

        for (int i = 0; i < m; i++) {

            arr2[i]=arr[n+i];
        }

    }

}

