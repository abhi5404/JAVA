package LinkedList;

class CircularNode {
    int val;
    CircularNode next;
    
    CircularNode() {
        this.val = 0;
        this.next = null;
    }
}

public class CovertSinglyToCircular {
    public static void main(String[] args) {
        CircularNode head = new CircularNode(); head.val = 1;
        head.next = new CircularNode(); head.next.val = 2;
        head.next.next = new CircularNode(); head.next.next.val = 3;
        head.next.next.next = new CircularNode(); head.next.next.next.val = 4;
        head.next.next.next.next = new CircularNode(); head.next.next.next.next.val = 5;

        // Convert to circular linked list
        CircularNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head; // Point the last CircularNode to the head to make it circular

        // Traversing the circular linked list
        temp = head;
        do {
            System.out.print(temp.val + " ");
            temp = temp.next;
        } while (temp != head); // Loop until we come back to the head
        System.out.println(); // Print a newline for better formatting
    }
}

