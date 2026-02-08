package LinkedList;

public class InsertAtIdx {
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
    static void insertAtIdx(Node head, int idx, int val) {
        Node t = new Node();
        t.val = val;
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
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
        int idx = 2;
        insertAtIdx(a, idx, 25);
        display(a);
    }
}

// key points:
// t.next=temp.next;
// temp.next=t;