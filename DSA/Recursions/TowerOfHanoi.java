package Recursions;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(3, 'A', 'C', 'B');
    }
    public static void hanoi(int n, char source, char destination, char helper){
        if(n==1){
            System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
            return;
        }
        hanoi(n-1, source, helper, destination); 
       
        System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
        hanoi(n-1, helper, destination, source);
    }
}
