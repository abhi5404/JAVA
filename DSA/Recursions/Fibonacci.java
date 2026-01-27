package Recursions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int fib = nthFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + fib);
        sc.close();
    }
    
    public static int nthFibonacci(int n) {
        if (n <= 1) return n;
        return nthFibonacci(n - 1) + nthFibonacci(n - 2);
    }
}





// class Solution {
//     public int nthFibonacci(int n) {
//        if (n<=1) return n ;
//        return nthFibonacci(n-1)+nthFibonacci(n-2);
        
//     }
