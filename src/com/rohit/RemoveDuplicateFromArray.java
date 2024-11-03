package src.com.rohit;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateFromArray {


    //if array not sorted
//    public static void main(String[] args) {
//
//
//        Integer[] arr = {1,2,2,3,4,4,4,4,3,1,3};
//
//        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
//
//        Integer[] arr5=  set.toArray(new Integer[0]);
//        for (Integer i : arr5) {
//            System.out.println(i);
//        }
//
//    }

    public static void main1(String[] args) {
        int[] array = {4, 2, 3, 2, 1, 1, 4, 3};
        int length = removeDuplicates(array);

        int[] newArray = new int[length ];

        for (int i = 0; i < length; i++) {
            newArray[i] = array[i];
            System.out.print(array[i] + " ");
        }
        System.out.println("s");
    }

    public static int removeDuplicates(int[] array) {
        if (array.length == 0) return 0;

        Arrays.sort(array);  // O(n log n)
        int index = 1;       // Pointer for unique elements

        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                array[index++] = array[i];
            }
        }
        return index;
    }


    public static void main2(String[] args) {

        int arr[] = {1,1,2,2,3,4,5,5,45,33,455};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for( int i = 0; i< arr.length; i++) {
            set.add(arr[i]);
        }
       int[] newArray = new  int[set.size()];
        int index = 0;

        for(int value: set){

            newArray[index++] = value;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newArray));


    }

    public static void main(String[] args) {
        int arr[] = {1,12,2,13,4,5,5,1,33,455};

        Arrays.sort(arr);



        int index = 1;
        for(int i = 1; i< arr.length; i++) {
            if(arr[i] != arr[i-1]){
                arr[index++] =arr[i];
            }

        }

        for(int i = 0 ; i < index ; i++) {
            System.out.print(arr[i]+  " ");
        }

    }





}
