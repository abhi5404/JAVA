package Arrays;

public class MissingInArray {
    
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 6};
        int n = arr.length + 1; // Since one number is missing
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int ele : arr) {
            actualSum += ele;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}
