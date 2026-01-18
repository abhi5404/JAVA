

import java.util.Scanner;

public class MaxOfFourBuiltin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Four numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int max = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println("The maximum number is: " + max);
        sc.close();
    }
    
}
