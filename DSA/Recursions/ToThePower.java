package Recursions;
import java.util.Scanner;

public class ToThePower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Base: ");
        int a = sc.nextInt();
         System.out.println("Enter Exponant: ");
        int b= sc.nextInt();
        System.out.println(a+ " raised to the power "+b+ " is "+ pow(a,b));
        sc.close();
    }
    public static int pow ( int a , int b ){
        if (b==0) return 1;
        return a*pow(a,b-1);
    }
}
