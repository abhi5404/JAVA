package Recursions;

public class LinearSearchUSingREcursion {
    public static void main(String[] args) {
        int[]arr={2,3,5,7,9,12,56,78,54,32};
        int ele = 78;
        System.out.println(exists(arr,ele,0));
    }
    
    private static boolean exists(int[] arr, int ele, int index){
        if(index >= arr.length){
            return false;
        }
        if(arr[index] == ele){
            return true;
        }
        return exists(arr, ele, index + 1);
    }
    }

