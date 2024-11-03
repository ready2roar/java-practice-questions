package src.com.rohit;

import java.util.Scanner;

public class fibonacci {


    static int n1 = 0, n2 = 1, n3= 2 ;

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();

        System.out.print(n1 + " ," + n2);
        fibo(number-2);

    }

    public static void fibo(int number) {
        //0,1
        if(number > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.print(" ," +n3);
            fibo(number -1);

        }
    }
}
