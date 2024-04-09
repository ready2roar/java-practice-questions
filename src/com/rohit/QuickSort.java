package src.com.rohit;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {1,23,23,33,233,5,6,54,67,787,7,8,776};
        int n = array.length;
        quickSort(array, 0, n-1);

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]+ " ");
        }
    }

    public static void  quickSort(int[] array, int low, int high){
        if(low < high){
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot-1);
            quickSort(array, pivot+1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {

        int pivot = array[high];
        int i = low-1;

        for (int j = low; j < high ; j++) {
            if(array[j] < pivot) {
                i++;
                //swap
                int temp = array[i];
                array[i]= array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = pivot;
        array[high] = temp;
        return i;
    }
}
