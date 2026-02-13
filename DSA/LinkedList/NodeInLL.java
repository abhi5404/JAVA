package LinkedList;


    class Node{
        int val;
        int data; // alias for val
        Node next;
        
        Node() {}
        
        Node(int val) {
            this.val = val;
            this.data = val;
        }
    }
    public class NodeInLL {
        public static void main(String[] args) {
            Node a = new Node(); a.val=10; a.data=10;
            Node b = new Node(); b.val=20; b.data=20;
            Node c = new Node(); c.val=30; c.data=30;
            Node d = new Node(); d.val=40; d.data=40;
            Node e = new Node(); e.val=50; e.data=50;
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            System.out.println(a.next.next.val);
            System.out.println(c);
            System.out.println(b.next);
            
        }

}
