package Arrays;

public class RotateArrays {
static void rotate(int []arr, int d){
    int n=arr.length;
    d=d%n; //in case d>n
    reverse(arr,0,d-1);
    reverse(arr,d,n-1);
    reverse(arr,0,n-1);
}

static void reverse(int []arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

        public static void main(String[] args) {
            int []arr= {1,2,3,4,5,6,7};
            int d=3;
            rotate(arr,d);
            for(int ele : arr) System.out.print(ele+" ");
        }
    }

// gfg
