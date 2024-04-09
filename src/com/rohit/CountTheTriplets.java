package src.com.rohit;

public class CountTheTriplets {
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        System.out.println(countTriplet(arr,n));
    }
    static long countTriplet(int arr[], int n){
        long sum = 0;
        long result = Integer.MIN_VALUE;
        // Your code here
        for(int i = 0 ; i < arr.length; i++){
            sum =sum + arr[i];
            if(result < sum){
                result = sum;
            }
            if(sum<0)
                sum=0;
        }
        return result;
    }
}
