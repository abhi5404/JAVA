package Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        // Shallow Copy
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] shallowCopyArray = originalArray; // Both reference the same array

        System.out.println("Before modifying shallow copy:");
        System.out.println("Original Array: ");
        printArray(originalArray);
        System.out.println("Shallow Copy Array: ");
        printArray(shallowCopyArray);

        // Modifying the shallow copy
        shallowCopyArray[0] = 10;

        System.out.println("After modifying shallow copy:");
        System.out.println("Original Array: ");
        printArray(originalArray);
        System.out.println("Shallow Copy Array: ");
        printArray(shallowCopyArray);

        // Deep Copy
        int[] deepCopyArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            deepCopyArray[i] = originalArray[i];
        }

        System.out.println("Before modifying deep copy:");
        System.out.println("Original Array: ");
        printArray(originalArray);
        System.out.println("Deep Copy Array: ");
        printArray(deepCopyArray);

        // Modifying the deep copy
        deepCopyArray[1] = 20;

        System.out.println("After modifying deep copy:");
        System.out.println("Original Array: ");
        printArray(originalArray);
        System.out.println("Deep Copy Array: ");
        printArray(deepCopyArray);
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}