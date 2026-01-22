package Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int n = arr.length;

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}





// class Solution {
//     public int getSecondLargest(int[] arr) {
//         int max = Integer.MIN_VALUE;
//         int secondMax = Integer.MIN_VALUE;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 secondMax = max;
//                 max = arr[i];
//             } else if (arr[i] > secondMax && arr[i] != max) {
//                 secondMax = arr[i];
//             }
//         }

//         if (secondMax == Integer.MIN_VALUE) {
//             return -1;
//         }

//         return secondMax;
//     }
// }