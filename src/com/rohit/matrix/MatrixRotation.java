package src.com.rohit.matrix;

public class MatrixRotation {
    public static void main(String[] args) {
        // Given 3x3 matrix with sequential values 0 to 8
        int[][] matrix = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}
        };

        // Print original matrix
        System.out.println("Original Matrix:");
       // printMatrix(matrix);
        printMatrix1(matrix);

        // Rotate matrix 90 degrees clockwise
       // rotateMatrix(matrix);

        // Print rotated matrix
        System.out.println("\nRotated Matrix 90 degrees clockwise:");
        //printMatrix(matrix);
    }

    // Function to rotate a 3x3 matrix 90 degrees clockwise
    public static void rotateMatrix(int[][] matrix) {
        // Step 1: Transpose the matrix
        transpose(matrix);
        System.out.println("\ntranspose Matrix :");
        printMatrix(matrix);
        // Step 2: Reverse each row
        reverseRows(matrix);
    }

    // Function to transpose a 3x3 matrix
    public static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                // Swap matrix[i][j] and matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    // Function to reverse each row of a 3x3 matrix
    public static void reverseRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int start = 0;
            int end = matrix[i].length - 1;
            while (start < end) {
                // Swap matrix[i][start] and matrix[i][end]
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }
    }

    // Function to print a 3x3 matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                //System.out.print(  " "+i+j);
            }
            System.out.println();
        }
    }

    public static void printMatrix1(int[][] matrix) {
        for (int i = matrix.length-1 ; i >= 0; i--) {
            for (int j = matrix[i].length-1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
                //System.out.print(  " "+i+j);
            }
            System.out.println();
        }
    }
}
