package src.com.rohit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class functionalProgramming {
    public static void main1(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(" in runnable---- thread");
            }
        };
        r.run();
        System.out.println("in main1");
    }

    public static void main2(String[] args) {
        Runnable r = ()->{
            System.out.println("in runnable method");
            main1(args);

        };
        r.run();
        System.out.println("in main");

    }

    public static void main(String[] args) {
        List<Integer> numbers
                = Arrays.asList(11,22, 22, 33, 44,44,
                55, 66, 77, 88,
                99, 100);

        for(int i = 0 ; i < numbers.size(); i++ ) {
            System.out.println(numbers.get(i) + " ");
        }

       Integer[] array = numbers.toArray(new Integer[0]);


       Integer[] aar1 = numbers.toArray(new Integer[0]);



        Set<Integer> set = new HashSet<>();
        for(int i =0;i < aar1.length; i++) {
            if(set.contains(aar1[i])) {
                System.out.println(" duplicate value is " +aar1[i] + " ");
            }
            else {

                set.add(aar1[i]);
            }

        }

    }


}
