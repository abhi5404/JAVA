package LinkedList;

class Node {
    int val;
    Node next;
    
    Node() {
        this.val = 0;
        this.next = null;
    }
}

public class CircularLLTraversal {
    public static void main(String[] args) {
        Node head = new Node(); head.val = 1;
        head.next = new Node(); head.next.val = 2;
        head.next.next = new Node(); head.next.next.val = 3;
        head.next.next.next = new Node(); head.next.next.next.val = 4;
        head.next.next.next.next = new Node(); head.next.next.next.next.val = 5;
        head.next.next.next.next.next = head; // Making it circular

        // Traversing the circular linked list
        Node temp = head;
        do {
            System.out.print(temp.val + " ");
            temp = temp.next;
        } while (temp != head); // Loop until we come back to the head
        System.out.println(); // Print a newline for better formatting
    }
}
