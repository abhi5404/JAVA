package Recursions;

import java.util.Scanner;

public class ReverseOfANumber {
    static int rev = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        reverse(n);
        System.out.println("Reverse: " + rev);

        sc.close();
    }

    static void reverse(int n) {
        if (n == 0) return;

        rev = rev * 10 + (n % 10);
        reverse(n / 10);
    }
}

// time complexity : O(d) where d is the number of digits in the number