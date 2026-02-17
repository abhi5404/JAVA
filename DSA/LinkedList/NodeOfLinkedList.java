package LinkedList;

public class NodeOfLinkedList {
    static class NodeDemo {
        int val;
        NodeDemo next;
        NodeDemo() {}
        NodeDemo(int val) { this.val = val; }
    }
    
    public static void main(String[] args) {
        // 10->20->30->40->50
        NodeDemo a = new NodeDemo(); a.val = 10; // head node
        NodeDemo b = new NodeDemo(); b.val = 20;
        NodeDemo c = new NodeDemo(); c.val = 30;
        NodeDemo d = new NodeDemo(); d.val = 40;
        NodeDemo e = new NodeDemo(); e.val = 50;
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
