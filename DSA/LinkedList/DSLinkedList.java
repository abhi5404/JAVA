package LinkedList;

public class DSLinkedList {
    static class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

static class LinkedList {

    Node head;

    // Add at Head
    void addAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Add at Tail
    void addAtTail(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at Index
    void insertAtIdx(int idx, int data) {
        if (idx == 0) {
            addAtHead(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 0; i < idx - 1; i++) {
            if (temp == null) return;
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Add at Middle (using slow-fast)
    void addAtMiddle(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        newNode.next = slow.next;
        slow.next = newNode;
    }

    // Delete at Head
    void deleteAtHead() {
        if (head == null) return;
        head = head.next;
    }

    // Display List
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addAtHead(10);
        list.addAtHead(5);
        list.addAtTail(20);
        list.addAtTail(30);

        list.display();   // 5 -> 10 -> 20 -> 30 -> null

        list.insertAtIdx(2, 15);
        list.display();   // 5 -> 10 -> 15 -> 20 -> 30 -> null

        list.addAtMiddle(99);
        list.display();   // middle inserted

        list.deleteAtHead();
        list.display();   // head deleted
    }
}
