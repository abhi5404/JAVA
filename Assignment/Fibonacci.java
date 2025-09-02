public class Fibonacci {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
// This program prints the first n Fibonacci numbers, where n is provided as a command-line argument.