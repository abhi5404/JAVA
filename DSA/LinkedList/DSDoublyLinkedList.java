package LinkedList;

public class DSDoublyLinkedList {
    static class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

static class DoublyLinkedList {

    Node head;

    // Add at Head
    void addAtHead(int data) {
        Node newNode = new Node(data);

        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }
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
        newNode.prev = temp;
    }

    // Insert at Index
    void insertAtIdx(int idx, int data) {
        if (idx == 0) {
            addAtHead(data);
            return;
        }

        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            if (temp == null) return;
            temp = temp.next;
        }

        if (temp.next == null) {
            addAtTail(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Add at Middle using slow-fast
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
        newNode.prev = slow;

        if (slow.next != null)
            slow.next.prev = newNode;

        slow.next = newNode;
    }

    // Delete at Head
    void deleteAtHead() {
        if (head == null) return;

        head = head.next;

        if (head != null)
            head.prev = null;
    }

    // Display Forward
    void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Display Backward
    void displayBackward() {
        if (head == null) return;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }
}

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addAtHead(10);
        list.addAtHead(5);
        list.addAtTail(20);
        list.addAtTail(30);

        list.displayForward();   // 5 <-> 10 <-> 20 <-> 30

        list.insertAtIdx(2, 15);
        list.displayForward();   // 5 <-> 10 <-> 15 <-> 20 <-> 30

        list.addAtMiddle(99);
        list.displayForward();

        list.deleteAtHead();
        list.displayForward();

        list.displayBackward();  // reverse print
    }
}
