package src.com.rohit.pattern;

public class Pattern1 {

    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {

        }
    }

    static int factorial(int n) {
        //5= 5*4*3*2*1
        //8 = 8*7*6*5*4*3*2*1
        int result = 1 ;

        if( n == 1 && n== 0)
            return 1;
        else {
            for (int i = 1; i < n ; i++) {
                result = result + result * i ;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }
}
