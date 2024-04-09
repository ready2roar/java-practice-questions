package src.com.rohit;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterInString {

    public static void main(String[] args) {
        String s = "Hello Rohit";
        DuplicateCharacterInString(s);
    }


    public static void DuplicateCharacterInString(String s){

        HashMap<Character,Integer> countMap = new HashMap<>();

        for (int i = 0; i <s.length() ; i++) {

            if(countMap.containsKey(s.charAt(i))){
                int value = countMap.get(s.charAt(i));
                countMap.put(s.charAt(i),countMap.get(s.charAt(i)) + 1);
            }else {
                countMap.put(s.charAt(i),1);
            }

        }

        System.out.println(countMap);

    }
}
