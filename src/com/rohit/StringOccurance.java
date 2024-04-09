package src.com.rohit;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringOccurance {


    public static void main(String[] args) {
        String s = "abchhess";
         count(s);
    }

    static void count(String s) {

        Map<Character,Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length()  ; i++) {
            if(hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i) ) +1);
            }
            else {
                hashMap.put(s.charAt(i), 1);
            }

        }

        for(char i : hashMap.keySet()) {
            if(hashMap.get(i) > 1) {
                System.out.println(hashMap.get(i));
            }
        }
    }
}
