package Arrays;

public class MulAdd {
  public static void main(String[] args) {
    int[]arr = {1,2,3,4,5};
    for(int i=0;i<arr.length;i++){
       if (arr[i]%2==0){
          arr[i]=arr[i]+10;
       } else {
          arr[i]=arr[i]*2;
       }
    }
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
}
