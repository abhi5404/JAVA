package Methods;

import java.util.Scanner;

public class SwapTwoNum {
    public static int[] swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        return new int[]{a,b};
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter a and b:");
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println("Before swapping: a = " + a + ", b = " + b);
      int[] result = swap(a, b);
      a = result[0];
      b = result[1];
      System.out.println("After swapping: a = " + a + ", b = " + b);
      sc.close();
    }
}
