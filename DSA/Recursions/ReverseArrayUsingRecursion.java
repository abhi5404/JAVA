// package Recursions;

// public class ReverseArrayUsingRecursion {
//        public static void main(String[] args) {
//         int[]arr={2,3,5,7,9,12,56,78,54,32};
//         recPrint(arr, arr.length - 1);
//     }
//     public static void recPrint(int[] arr, int idx){
        
//         if(idx<0) return;
//         System.out.print(arr[idx] + " ");
//         recPrint(arr, idx-1);
//     }
// }


package Recursions;

public class ReverseArrayUsingRecursion {
    public static void main(String[] args) {
        int[]arr={2,3,5,7,9,12,56,78,54,32};
        recPrint(arr,0);
    }
    public static void recPrint(int[] arr, int idx){
        int n=arr.length;
        if(idx==n) return;
        recPrint(arr, idx+1);
        System.out.print(arr[idx] + " ");
      
    }
}

// time complexity : O(n)