package src.com.practice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){


        int[] array = {1,23,23,33,233,5,6,54,67,787,7,8,776};

        System.out.println(Arrays.stream(array).average());
        System.out.println(1 == 1);
    }
}
