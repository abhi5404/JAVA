package CyclicSort;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        
        System.out.println("Original array:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        cyclicSort(arr);

        System.out.println("Sorted array:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void cyclicSort(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] == i + 1) {
                i++;
            } else {
                int idx = arr[i] - 1;
                swap(arr, idx, i);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
