package src.com.rohit;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {
        int ans = romanToInt("IXI");
        System.out.println(ans);
    }

    static int romanToInt(String s){
        int result = 0;
        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if(i> 0 && map.get(s.charAt(i)) > map.get(s.charAt(i-1))) // "IX" - 9
                result = result + map.get(s.charAt(i)) - 2 * map.get(s.charAt(i-1)); // result += !0 - 2*1 ;
            else
                result = result + map.get(s.charAt(i));


        }

        return result;
    }
}
