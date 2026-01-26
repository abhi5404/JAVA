package Recursions;

import java.util.Scanner;

public class Print1toN {
    public static void main(String[] args) {
        
        System.out.print("Enter N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
        print (1,n);
        sc.close();
    }
    public static void print(int x , int n ){
        if (x>n) return ;
        System.out.println(x);
        print (x+1, n);
    }
}
