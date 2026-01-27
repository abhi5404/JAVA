package Recursions;

public class SumofnaturalNo {
    public static void main(String[] args) {
        int n = 5;
        int sum = findSum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
    }
    public static int findSum(int n) {
        if (n == 1) return 1;
        return n + findSum(n - 1);
    }
}




// class Solution {
//     public static int findSum(int n) {
        
//         // return n*(n-1)/2;
//         if(n==1) return 1;
//         return n+ findSum(n-1);
        
//     }
// }