// package Arrays;

// public class ReverseArray {
//     public static void main(String[] args) {
//         int []arr= {12,34,65,90,2,5,98};
//         int i=0;
//         int j=arr.length-1;
//         while(i<j){
//             int temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//             i++;
//             j--;
//         }
//         for(int ele : arr) System.out.print(ele+" ");
//     }
    
// }

// using for loop

package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int []arr= {12,34,65,90,2,5,98};
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        for(int ele : arr) System.out.print(ele+" ");
    }
    
}
