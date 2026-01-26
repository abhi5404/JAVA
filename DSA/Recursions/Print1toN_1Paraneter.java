package Recursions;

import java.util.Scanner;

public class Print1toN_1Paraneter {
    public static void main(String[] args) {
        System.out.print("Enter N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();
    }
    public static void print (int n){
        if (n==0) return ;
        print(n-1);
        System.out.print(n + " ");
    }
}
