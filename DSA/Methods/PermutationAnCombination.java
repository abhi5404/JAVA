package Methods;

import java.util.Scanner;

public class PermutationAnCombination {
public static int fact(int x){
    int f=1;
    for(int i=1;i<=x;i++){
        f*=i;
    }
    return f;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n and r:");
    int n=sc.nextInt();
    int r=sc.nextInt();
    int npr=fact(n)/fact(n-r);
    int ncr=fact(n)/(fact(r)*fact(n-r));
    System.out.println("nPr is: "+npr);
    System.out.println("nCr is: "+ncr);
    sc.close();
}
    
}
