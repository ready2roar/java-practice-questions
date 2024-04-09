public class PracticeJava {
    public static void main(String[] args) {

        int[] numbers = {11,12,-3,-33,32,23,23,445,65,6,67,56,24525,25,45,5345,41};
        int num= 23;
        System.out.println(arraySearchWithNumber(numbers,num));
    }

    static int arraySearch(int arr[], int toSearch){
        if(arr.length == 0){
            return -1;
        }
        else {
            for(int index= 0 ; index< arr.length; index++)
            {
                if(arr[index] == toSearch){
                    return index;
                }
            }
        }
    return -1;
    }


    static int arraySearchWithNumber(int[] arr, int toSearch){
        if(arr.length == 0){
            return -1;
        }
        else {
            for(int ltoSearch : arr)
            {
                if(toSearch == ltoSearch){
                    System.out.println();
                    return ltoSearch;
                }
            }
        }
        return -1;
    }
}
