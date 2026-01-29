package Recursions;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {
        int[]arr={2,3,5,7,9,12,56,78,54,32};
        int target = 78;
        System.out.println(search(arr , target));
    }
    
    public static int helper(int[] arr, int target , int lo , int hi) {
        if (lo>hi) return -1;
        int mid = lo + (hi-lo)/2;
        if (arr[mid]==target) return mid;
        else if (arr[mid]>target) return helper (arr , target , lo , mid-1);
        else return helper(arr , target , mid+1 , hi);
    }
    
    public static int search(int[] arr, int target) {
        int n = arr.length;
        return helper(arr , target , 0, n-1);
    }
}




// class Solution {
//     public int helper(int[] nums, int target , int lo , int hi) {
//         if (lo>hi) return -1;
//         int mid = lo + (hi-lo)/2;
//         if (nums[mid]==target) return mid;
//         else if (nums[mid]>target) return helper (nums , target , lo , mid-1);
//         else return helper(nums , target , mid+1 , hi);
//     }
//       public int search(int[] nums, int target) {
//         int n = nums.length;
//         return helper(nums , target , 0, n-1);
//       }
// }