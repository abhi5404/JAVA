package Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        // Shallow Copy
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] shallowCopyArray = originalArray; // Both reference the same array

        System.out.println("Original Array before modification:");
        printArray(originalArray);

        shallowCopyArray[0] = 10; // Modifying the shallow copy

        System.out.println("Original Array after modifying shallow copy:");
        printArray(originalArray); // Reflects change

        // Deep Copy
        int[] deepCopyArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            deepCopyArray[i] = originalArray[i]; // Copying elements
        }

        System.out.println("Original Array before modifying deep copy:");
        printArray(originalArray);

        deepCopyArray[1] = 20; // Modifying the deep copy

        System.out.println("Original Array after modifying deep copy:");
        printArray(originalArray); // Does not reflect change
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}