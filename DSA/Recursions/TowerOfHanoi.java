package Recursions;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(4, 'A', 'C', 'B');
    }
    public static void hanoi(int n, char source, char destination, char helper){
        if(n==1){
            System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
            return;
        }
        hanoi(n-1, source, helper, destination); // move n-1 disks from source to helper via destination
       
        System.out.println("Transfer disk " + n + " from " + source + " to " + destination); // move the nth disk from source to destination
        hanoi(n-1, helper, destination, source); // move n-1 disks from helper to destination via source
    }
}
