package LinkedList;

public class NodeOfLinkedList {
    static class Node {
        int val;
        Node next;
        Node() {}
        Node(int val) { this.val = val; }
    }
    
    public static void main(String[] args) {
        // 10->20->30->40->50
        Node a = new Node(); a.val = 10; // head node
        Node b = new Node(); b.val = 20;
        Node c = new Node(); c.val = 30;
        Node d = new Node(); d.val = 40;
        Node e = new Node(); e.val = 50;
        // Connect karenge (Link karenge)
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println(e.val);
        System.out.println(a.next.next.next.val);
        System.out.println(c);
        System.out.println(b.next);
        System.out.println(a.next.next);
    }
}
