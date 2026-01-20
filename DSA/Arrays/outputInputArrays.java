package Arrays;
import java.util.Scanner;

public class outputInputArrays {
    public static void main(String[] args) {
        // int [] arr = {5, 10, 15, 20, 25};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter " + size + " elements for the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
           

        }
        sc.close();
        System.out.println("The elements in the array are:");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}

