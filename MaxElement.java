// Program Name: MaxElement
// Description: Find maximum value in array with validation

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size;

        System.out.print("Enter array size: ");
        size = scanner.nextInt();

        // Validate input
        if (size <= 0) {
            System.err.println("Invalid array size!");
            System.exit(0);
        }

        int[] numbers = new int[size];

        // Input elements
        System.out.println("Enter elements:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];

        // Find maximum
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum element: " + max);
    }
}