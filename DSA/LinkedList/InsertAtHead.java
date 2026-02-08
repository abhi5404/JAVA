package LinkedList;
class Node {
    int val;
    Node next;
}

public class InsertAtHead{
      static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node insertAtHead(int val , Node head){
        Node temp = new Node();
        temp.val = val;
        temp.next = head;
        head = temp;
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
        a = insertAtHead(5, a);
        display(a);
    }
    
}


//key points:
// create a new node like : Node temp = new Node();
// then assign the value to the new node : temp.val = val;
// then link the new node to the head : temp.next = head;
// then update the head to the new node : head = temp;