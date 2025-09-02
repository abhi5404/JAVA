import java.util.Scanner;

class MyArray {
    int[] arr;
    int n;
    MyArray() {
        n = 5;
        arr = new int[] {10, 5, 30, 25, 15};
    }
    MyArray(int size) {
        n = size;
        arr = new int[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void bubbleSort() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class TestArray {
    public static void main(String[] args) {
        System.out.println("Using Default Constructor:");
        MyArray a1 = new MyArray();
        System.out.print("Before Sorting: ");
        a1.display();
        a1.bubbleSort();
        System.out.print("After Sorting: ");
        a1.display();
        System.out.println("\nUsing Parameterized Constructor:");
        MyArray a2 = new MyArray(5);
        System.out.print("Before Sorting: ");
        a2.display();
        a2.bubbleSort();
        System.out.print("After Sorting: ");
        a2.display();
    }
}

//TEST ARRAY
