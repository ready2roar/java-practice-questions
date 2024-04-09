package src.com.rohit;

import java.util.*;

public class FindRestaurant {
    public static void main(String[] args) {

        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};
        String[] ans = findRestaurant(list1,list2);
        System.out.println(Arrays.toString(ans));
    }


        public static String[] findRestaurant(String[] list1, String[] list2) {
            Map<String, Integer> map = new HashMap<>();
            List<String> res = new LinkedList<>();
            int minSum = Integer.MAX_VALUE;
            for (int i=0;i<list1.length;i++)
                map.put(list1[i], i);
            for (int i=0;i<list2.length;i++) {
                Integer j = map.get(list2[i]);
                if (j != null && i + j <= minSum) {
                    if (i + j < minSum) {
                        res.clear();
                        minSum = i+j;
                    }
                    res.add(list2[i]);
                }
            }
            return res.toArray(new String[res.size()]);
        }

}
