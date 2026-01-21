package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int []arr= {12,34,65,90,2,5,98};
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele : arr) System.out.print(ele+" ");
    }
    
}
