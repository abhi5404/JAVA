package Arrays;
import java.util.Scanner;
public class MaxElement {
          public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        sc.close();
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if(arr[i]>max) max = arr[i];
        }
        System.out.println("Max element in the array is: " + max);
    }
}
 
