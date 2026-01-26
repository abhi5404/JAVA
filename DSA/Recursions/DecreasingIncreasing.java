package Recursions;

import java.util.Scanner;

public class DecreasingIncreasing {
     public static void main(String[] args) {
        System.out.print("Enter N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
    public static void print (int n){
        if (n==0) return ;
        System.out.print(n + " ");
        print(n-1);
        System.out.print(n + " ");
      
    }
}

