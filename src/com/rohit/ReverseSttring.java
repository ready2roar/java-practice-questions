package src.com.rohit;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class ReverseSttring {
//    public static void main(String[] args) {
//        String s = "super man bat man spider man";
//        String a= "";
//
//        for (int i = 0; i < s.length() ; i++) {
//            a = s.charAt(i) + a;
//        }
//        System.out.println(a);
//    }


//    public static void main(String[] args) {
//        String s = "super man bat man spider man";
//        int count;
//        String[] words = s.split(" ");
//
//        for(int i = 0; i < words.length; i++) {
//            count = 1;
//            for(int j = i+1; j < words.length; j++) {
//                if(words[i].equals(words[j])) {
//                    count++;
//                    //Set words[j] to 0 to avoid printing visited word
//                    words[j] = "0";
//                }
//            }
//            //Displays the duplicate word if count is greater than 1
//            if(count > 1 && words[i] != "0")
//                System.out.println(words[i]+ "  " +count);
//        }
//
//    }

//    public static void main(String[] args) {
//        String s = "spider man  super bat man super man";  //man  3
//        String[] s1 = s.split(" ");
//
//        for (int i = 0; i < s1.length; i++) {
//            int count = 1;
//            for (int j = i+1; j < s1.length; j++) {
//                if(s1[i].equals(s1[j])) {
//                    count++;
//                    s1[j] = "0";
//                }
//            }
//            if(count > 1 && s1[i]!="0") {
//                System.out.println(s1[i] + " " + count);
//            }
//        }
//    }


//    public static void main(String[] args) {
//        String s = "spider man bat man joker man joker" ;
//        String[] s1 = s.split(" ");
//
//        HashMap<String, Integer> hashMap = new HashMap<>();
//
//
//        for(String word : s1) {
//
//            if(hashMap.containsKey(word)) {
//               hashMap.put(word, hashMap.get(word) + 1);
//            }
//            else {
//                hashMap.put(word,1);
//            }
//
//        }
//
//        for(String value : hashMap.keySet()) {
//
//            if(hashMap.get(value) > 1)  {
//                System.out.println(value + " " + hashMap.get(value));
//            }
//        }
//
//
//    }

//    public static void main(String[] args) {
//
//        String s = "asdfgrdsadf" ;
//
//        HashMap<Character, Integer> hashMap = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            if(hashMap.containsKey(s.charAt(i))) {
//
//                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i)) +1);
//            }
//            else {
//                hashMap.put(s.charAt(i),1);
//            }
//
//        }
//
//        for (char i : hashMap.keySet()) {
//            if(hashMap.get(i) > 1) {
//                System.out.println(i +" " +hashMap.get(i));
//            }
//
//        }
//
//    }


//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       String sen = sc.nextLine();
//       String rev = "";
//       for(int i = sen.length() -1; i>= 0 ; i--) {
//           rev = rev + sen.charAt(i);
//       }
//       System.out.println(rev);
//    }
//
//    public static void main(String[] args) {
//        String s= "sprid man ddsffs ddsffs man akfks ";
//
//        String[] s1 = s.split(" ");
//        HashMap<String, Integer> hashMap = new HashMap<>();
//        for (String i : s1) {
//            if(hashMap.containsKey(i))
//                hashMap.put(i,hashMap.get(i) + 1);
//            else {
//                hashMap.put(i,1);
//            }
//
//        }
//        for(String word : hashMap.keySet()) {
//            if(hashMap.get(word) > 1)
//                System.out.println(word + " "+ hashMap.get(word));
//        }
//    }

    // Palinedrome

//        public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       String sen = sc.next();
//       String rev = "";
//       for(int i = sen.length() -1; i>= 0 ; i--) {
//           rev = rev + sen.charAt(i);
//       }
//
//
//       if(sen.equals(rev))
//       {
//           System.out.println("palindrome");
//       }
//       else
//       System.out.println("not");
//
//    }

    //factorial     4! = 4*3*2*1 = 24
                    //5! = 5*4*3*2*1 = 120

//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int fact = 1;
//        for(int i=1; i<=num; i++) {
//            fact = fact * i;
//        }
//        System.out.println(fact);
//    }

    //factorial using recurrsion
//    public static void main(String[] args) {
//        int fact= 1;
//        int number = 5;
//        fact = factorial(number);
//        System.out.println(fact);
//    }
//
//    static int factorial(int n) {
//        if(n==0)
//            return 1;
//        else
//            return (n * factorial(n-1));
//    }

    static void removeDups(int[] a, int n)
    {

        // Hash map which will store the
        // elements which has appeared previously.
        HashMap<Integer, Boolean> mp = new HashMap<>();

        for (int i = 0; i < n; ++i) {

            // Print the element if it is not
            // present there in the hash map
            // and Insert the element in the hash map
            if (mp.get(a[i]) == null)
            {
                System.out.print(a[i] + " ");
                mp.put(a[i], true);
            }
        }
    }
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 5, 1, 7, 2, 4, 2 };

        int n = arr.length;
        removeDups(arr, n);
    }


}
