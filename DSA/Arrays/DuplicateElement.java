

package Arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 2, 5, 3};
        int n = arr.length;
        System.out.print("Duplicate Elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break; // To avoid printing the same duplicate multiple times
                }
            }
        }
    }
}


// Using Sum Approach
// package Arrays;
// public class DuplicateElement {
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 2, 5};
//         int n = arr.length - 1; // Since one number is duplicate
//         int expectedSum = n * (n + 1) / 2;
//         int actualSum = 0;
//         for (int ele : arr) {
//             actualSum += ele;
//         }
//         int duplicateNumber = actualSum - expectedSum;
//         System.out.println("The duplicate number is: " + duplicateNumber);
//     }
// }


// time complexity: O(n^2)