package Arrays;

public class BasicArrays {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Access and print elements of the array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Modify an element in the array
        numbers[2] = 99;
        System.out.println("After modification, element at index 2: " + numbers[2]);
    }
    
}
