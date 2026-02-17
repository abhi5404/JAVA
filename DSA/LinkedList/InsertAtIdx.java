package LinkedList;

public class InsertAtIdx {
    NodeDemo head;
    int size;

    static class NodeDemo {
        int val;
        NodeDemo next;

        NodeDemo(int val) {
            this.val = val;
            this.next = null;
        }
    }

    void display() {
        NodeDemo temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void addAtHead(int val) {
        NodeDemo t = new NodeDemo(val);
        t.next = head;
        head = t;
        size++;
    }

    void addAtTail(int val) {
        NodeDemo t = new NodeDemo(val);
        if (head == null) {
            head = t;
        } else {
            NodeDemo temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = t;
        }
        size++;
    }

    void insert(int val, int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid Index!");
            return;
        }
        if (idx == 0) addAtHead(val);
        else if (idx == size) addAtTail(val);
        else {
            NodeDemo temp = head;
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }

            NodeDemo t = new NodeDemo(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }

    public static void main(String[] args) {
        InsertAtIdx list = new InsertAtIdx();
        
        // Build initial list: 10 -> 20 -> 30 -> 40 -> 50
        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtTail(40);
        list.addAtTail(50);
        
        System.out.print("Original: ");
        list.display();
        
        // Insert 25 at index 2
        list.insert(25, 2);
        System.out.print("After insert(25, 2): ");
        list.display();
        
        // Insert at head
        list.insert(5, 0);
        System.out.print("After insert(5, 0): ");
        list.display();
        
        // Insert at tail
        list.insert(60, list.size);
        System.out.print("After insert(60, size): ");
        list.display();
        
        // Invalid index test
        list.insert(100, -1);
        list.insert(100, 20);
    }
}

// key points:
// 1. Validate index: idx < 0 || idx > size
// 2. Edge cases: idx==0 -> addAtHead, idx==size -> addAtTail
// 3. t.next = temp.next;
// 4. temp.next = t;