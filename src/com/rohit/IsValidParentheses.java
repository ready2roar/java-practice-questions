package src.com.rohit;

import java.util.Stack;

public class IsValidParentheses {

    public static void main(String[] args) {

     boolean ans = IsValidParentheses.isValid("[]()[]");
     boolean ans1 = IsValidParentheses.isValidParenthesis("([])))))");
        System.out.println(ans1);
    }
    public static boolean isValid(String s) {
        if(s.length() % 2 !=0 ) return false; // to check if length of string is odd return false
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if(c == '{' || c == '['  || c == '(')
                stack.push(c);
            else if (c =='}' && !stack.isEmpty() && stack.peek() == '{' )
                stack.pop();
            else if (c ==')' && !stack.isEmpty() && stack.peek() == '(' )
                stack.pop();
            else if (c ==']' && !stack.isEmpty() && stack.peek() == '[' )
                stack.pop();
            else
                return false;// for the case "([])))))"
        }
        return stack.isEmpty();
    }



    public static boolean isValidParenthesis(String s){

        if(s.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(c == '{' || c == '[' || c == '(')
                stack.push(c);
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }
            else if(c== ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
            else if(c==')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();

            else
                return false;

        }


        return stack.isEmpty();
    }
}
