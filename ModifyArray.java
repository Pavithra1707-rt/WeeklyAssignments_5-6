// Program Name: ModifyArray
// Description: Modify values in array

public class ModifyArray {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        // Modify element
        numbers[2] = 100;

        // Display updated array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}