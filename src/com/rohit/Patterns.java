package src.com.rohit;

public class Patterns {


    public static void main(String[] args) {
       // pattern1(5);
        pattern2(5);
    }

    /**
     *
     * @param n
     *      *
     *     **
     *    ***
     *   ****
     *  *****
     * ******
     */
    static void pattern1(int n){
        int m = n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if( j>=m)
                    System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
            --m;

        }

    }


    /**
     *
     * @param n
     *
     *      *
     *     * *
     *    * * *
     *   * * * *
     *  * * * * *
     * * * * * * *
     */
    static void pattern2(int n){
        int m = n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if( j>=m)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
            --m;

        }

    }



}
