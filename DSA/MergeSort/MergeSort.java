package MergeSort;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        
        System.out.println("Original array:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        mergeSort(arr);

        System.out.println("Sorted array:");
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1) return; // single element array is already sorted

        // Step 1: create two subarrays
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        // Step 2: copy elements into subarrays
        int idx = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[idx++];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[idx++];
        }

        // Step 3: recursive calls
        mergeSort(a);
        mergeSort(b);

        // Step 4: merge both arrays
        merge(a, b, arr);
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        while (i < a.length) {
            c[k++] = a[i++];
        }

        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}

