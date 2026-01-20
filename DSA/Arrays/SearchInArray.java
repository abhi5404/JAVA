package Arrays;

public class SearchInArray {
    public static void main(String[] args) {
        int[] arr = {4,1,7,5,3,-10,12,20,-5};
        int target = 12;
   for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element " + target + " found at index: " + i);
                return;
            }
        }
        System.out.println("Element " + target + " not found in the array.");
    }
}
