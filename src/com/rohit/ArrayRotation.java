package src.com.rohit;

public class ArrayRotation {


    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
      //  int N = sizeof(arr) / sizeof(arr[0]);

        int d = 2;

        leftRotate(arr,d);


       printTheArray(arr);
    }

    // time - O(N), space - O(1)

    static void leftRotate(int arr[], int d)
    {

        if (d == 0)
            return;

        int n = arr.length;
        // in case the rotating factor is
        // greater than array length
        d = d % n;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    /*Function to reverse arr[] from index start to end*/
    static void reverseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

//    case 2:   time - O(N * d), space - O(1)

//    public static void rotate(int[] arr,int d) {
//        while(d > 0){
//            int temp = arr[0];
//            for (int i = 0; i < arr.length - 1; i++) {
//                arr[i] = arr[i+1];
//            }
//            arr[arr.length-1] = temp;
//            d--;
//        }
//    }



    //case 1   time - O(N), space - O(N)

//    public static void rotate(int[] arr, int d){
//        int[] temp = new int[arr.length];
//    int k=0;
//
//        for (int i = d; i < arr.length; i++) {
//            temp[k] = arr[i];
//            k++;
//
//        }
//        for (int i = 0; i < d; i++) {
//            temp[k] = arr[i];
//            k++;
//        }
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i]=temp[i];
//
//        }
//    }


    // Function to print elements of array
    public  static void printTheArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
