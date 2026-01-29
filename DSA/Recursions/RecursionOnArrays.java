package Recursions;

public class RecursionOnArrays {
    public static void main(String[] args) {
        int[]arr={2,3,5,7,9,12,56,78,54,32};
        recPrint(arr,0);
    }
    public static void recPrint(int[] arr, int idx){
        int n=arr.length;
        if(idx==n) return;
        System.out.print(arr[idx] + " ");
        recPrint(arr, idx+1);
    }
}
