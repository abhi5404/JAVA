package Recursions;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        System.out.print("Enter N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digits = (int)Math.log10(n) + 1; // Calculate number of digits
        System.out.println("Reverse: " + reverse(n, digits));
        sc.close();
    }
    public static int reverse(int n, int digits){
        if (n % 10 == n) return n;
        int rem = n % 10;
        return rem * (int)Math.pow(10, digits - 1) + reverse(n / 10, digits - 1);
    }
}
