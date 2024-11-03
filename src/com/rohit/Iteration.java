package src.com.rohit;

import java.util.*;

public class Iteration {
//
//    public static void main(String[] args) {
//
//        int[] arr = {1, 2, 3, -34, 12, 1234, 3, 34, 9879, 67, 676};
//        String[] s =  {"orange", "apple", "banana", "kiwi", "mango" };
//
////        Arrays.sort(arr);
//
//        for (int number : arr) {
//            System.out.print(number + " ,");
//        }
//        System.out.println();
//        for(int i = 0 ; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//       // Arrays.stream(arr).forEach(System.out::println);
//        String value = "";
//        List<int[]> list = Arrays.asList(arr);
//        if(list.isEmpty()){
//            System.out.println(" empty");
//        }
//        else {
//            value =  list.toString().replace("[","").replace("]","");
//        }
//        ListIterator<int[]> l1 = list.listIterator();
//
//        while(l1.hasNext())
//            System.out.println(l1.next());
//
//
//
//
////    int min = arr[0], max = arr[0];
////        for(int num : arr) {
////            if(num < min)
////                min = num;
////            if(num > max)
////                max = num;
////        }
////        System.out.println(min+","+max);
////    }
//
//    }


    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);



        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }





}
