// Program Name: MatrixDisplay
// Description: Input and display 2D array

import java.util.Scanner;

public class MatrixDisplay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows, cols;

        // Input validation
        System.out.print("Enter number of rows: ");
        rows = scanner.nextInt();

        if (rows <= 0) {
            System.err.println("Invalid rows!");
            System.exit(0);
        }

        System.out.print("Enter number of columns: ");
        cols = scanner.nextInt();

        if (cols <= 0) {
            System.err.println("Invalid columns!");
            System.exit(0);
        }

        int[][] matrix = new int[rows][cols];

        // Input elements
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display matrix
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}