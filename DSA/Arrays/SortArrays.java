package Arrays;
import java.util.Arrays;

public class SortArrays {
public static void main(String[] args) {
    int[] arr = {4,1,7,5,3,-10,12,20,-5};
    System.out.println("Array before sorting:");
    printArray(arr);
    Arrays.sort(arr);
    System.out.println("Array after sorting:");
    printArray(arr);
}

public static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }   
        System.out.println();
    }
}