package src.com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java1 {




    public static void main(String[] args) {
//
//        List<Integer> list = Arrays.asList(1,3,4,5,6,78,34,44,23,3);
//        List<Integer> list1 = list.stream().filter(number -> number %2 !=0 ).collect(Collectors.toList());
//        System.out.println(list1);
//        list.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
//
//        String s = "Java";
//        s= "hello";
//        System.out.println(s);


        System.out.println(100+100+"test1");
        System.out.println("test2"+100+100);


    }

    static void occurence(String s) {

        Map<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length() ; i++) {

            if(hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i)) + 1);
            }
            else {
                hashMap.put(s.charAt(i),1);
            }

        }

    }

}
