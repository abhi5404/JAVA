package LinkedList;

public class DeleteAtHead {
    static class NodeDemo {
        int val;
        NodeDemo next;
    }

    static void display(NodeDemo head) {
        NodeDemo temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static NodeDemo deleteAtHead(NodeDemo head) {
        if (head == null) {
            return null;
        }
        head = head.next;
        return head;
    }
      public static void main(String[] args) {
        NodeDemo a = new NodeDemo(); a.val = 10;
        NodeDemo b = new NodeDemo(); b.val = 20;
        NodeDemo c = new NodeDemo(); c.val = 30;
        NodeDemo d = new NodeDemo(); d.val = 40;
        NodeDemo e = new NodeDemo(); e.val = 50;
        
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
