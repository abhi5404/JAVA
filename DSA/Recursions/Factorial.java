package Recursions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial: " + fact(n));
        sc.close();
    }
    public static int fact (int n){
        if (n==0 || n==1) return 1;
        int ans = n*fact(n-1);
        return ans;
    }
}

//time complexity : O(n)
