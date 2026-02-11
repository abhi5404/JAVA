package LinkedList;

public class InsertAtTail {
   
        static void display(Node head) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    static Node insertAtTail(int val , Node tail){
        Node temp = new Node();
        temp.val = val;
        tail.next = temp;
        tail = temp;
        return tail;
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
        e = insertAtTail(60, e);
        display(a);
    }
}


//key points:
// create a new node like : Node temp = new Node();
// then assign the value to the new node : temp.val = val;
// then link the new node to the tail : tail.next = temp;
// then update the tail to the new node : tail = temp;
