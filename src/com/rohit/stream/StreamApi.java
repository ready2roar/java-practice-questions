package src.com.rohit.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApi {




    public static void main1(String[] args) {

        List<Integer> list = Arrays.asList(1,23,44,5,3,12,34,23);
        List<Integer> list1;
        // list1= list.stream().filter( val -> val % 2 == 0).collect(Collectors.toList());

        list.stream().filter( val -> val % 2 != 0 ).collect(Collectors.toList());

        // Partitioning into even and odd using Stream API
        Map<Boolean, List<Integer>> partitioned = list.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));

        List<Integer> evenList = partitioned.get(true);   // Even numbers list
        List<Integer> oddList = partitioned.get(false);   // Odd numbers list

        // Printing even and odd lists
        System.out.println("Even numbers: " + evenList);
        System.out.println("Odd numbers: " + oddList);


    }


    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(1, 23, 44, 5, 0, 3, 12, 0, 34, 23);

        // Grouping into even, odd, and zero using Stream API
        Map<String, List<Integer>> grouped = list.stream()
                .collect(Collectors.groupingBy(
                        i -> {
                            if (i == 0) return "zero";
                            else if (i % 2 == 0) return "even";
                            else return "odd";
                        }
                ));

        List<Integer> evenList = grouped.getOrDefault("even", new ArrayList<>());   // Even numbers list
        List<Integer> oddList = grouped.getOrDefault("odd", new ArrayList<>());     // Odd numbers list
        List<Integer> zeroList = grouped.getOrDefault("zero", new ArrayList<>());   // Zero numbers list

        // Printing even, odd, and zero lists
        System.out.println("Even numbers: " + evenList);
        System.out.println("Odd numbers: " + oddList);
        System.out.println("Zero numbers: " + zeroList);
    }
}
