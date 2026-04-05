// Program Name: ArrayUsingLoop
// Description: Print array elements using for loop

public class ArrayUsingLoop {
    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25};

        // Loop using length property
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}