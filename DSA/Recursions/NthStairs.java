package Recursions;

public class NthStairs {
    public static void main(String[] args) {
        int n = 5; // Example: Change this value to test with different inputs
        int ways = countWays(n);
        System.out.println("Number of ways to climb " + n + " stairs: " + ways);
    }
    public static int countWays(int n) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        return countWays(n - 1) + countWays(n - 2);
    }
}

// time complexity : O(2^n)