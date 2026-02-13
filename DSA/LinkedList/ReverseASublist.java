package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseASublist {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int left = 2;
        int right = 4;

        Node result = reverseSublist(head, left, right);

        // Print the modified linked list
        Node temp = result;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(); // Print a newline for better formatting
    }

    public static Node reverseSublist(Node head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        // Move prev to the node before the left position
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        Node curr = prev.next;

        // Reverse the sublist
        for (int i = 0; i < right - left; i++) {
            Node next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }
}
