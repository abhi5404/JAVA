package Recursions;

public class GCD {
    public static void main(String[] args) {
        int a = 56;
        int b = 98;
        int gcd = findGCD(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }
    public static int findGCD(int a, int b) {
        if (b == 0) return a;
        return findGCD(b, a % b);
    }
}

// time complexity : O(log(min(a, b)))  
