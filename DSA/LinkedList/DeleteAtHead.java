package LinkedList;

public class DeleteAtHead {
    static class Node {
        int val;
        Node next;
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node deleteAtHead(Node head) {
        if (head == null) {
            return null;
        }
        head = head.next;
        return head;
    }
      public static void main(String[] args) {
        Node a = new Node(); a.val = 10;
        Node b = new Node(); b.val = 20;
        Node c = new Node(); c.val = 30;
        Node d = new Node(); d.val = 40;
        Node e = new Node(); e.val = 50;
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
        a = deleteAtHead(a);
        display(a);
    }
}

// key points:
// to delete at head, we need to update the head to the next node of the current head : head = head.next;
