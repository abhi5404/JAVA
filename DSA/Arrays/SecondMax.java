package Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int arr[] = {34, 67, 23, 89, 2, 90, 45};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]>secondMax && arr[j]<max){
                    secondMax=arr[j];
                }
            }
        }
        System.out.println("Second Maximum: " + secondMax);
    }
}
