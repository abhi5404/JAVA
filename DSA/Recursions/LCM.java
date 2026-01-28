package Recursions;

public class LCM {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int lcm = findLCM(a, b);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}