package src.com.rohit.matrix;

public class Matrix {

    // 1.

    /**
     *
     * 1 2 3
     * 4 5 6
     * 7 8 9
     *
     */


    public static void main1(String[] args) {
        // Define dimensions of the matrix
        int rows = 3;
        int cols = 4;

        // Create a 2D array (matrix)
        int[][] matrix = new int[rows][cols];

        // Initialize the matrix with some values (for demonstration)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = i * cols + j; // filling with sequential numbers
            }
        }

        // Print the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }



 //   2.

    /**
     *
     * 0 3 6
     * 1 4 7
     * 2 5 8
     */

    public static void main(String[] args) {
        int rows= 3;
        int columns = 3;

        int[][] matrix = new int[rows][columns];
       int value = 0 ;
       for(int j=0; j< columns; j++){
           for(int i = 0;i < rows ;i++) {
               matrix[i][j]= value++;
           }
       }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line for the next row
        }
    }

}
