package LinkedList;

public class ReverseASublist {
    static class NodeDemo {
        int data;
        NodeDemo next;
        NodeDemo(int data) { this.data = data; this.next = null; }
    }
    
    public static void main(String[] args) {
        NodeDemo head = new NodeDemo(1);
        head.next = new NodeDemo(2);
        head.next.next = new NodeDemo(3);
        head.next.next.next = new NodeDemo(4);
        head.next.next.next.next = new NodeDemo(5);

        int left = 2;
        int right = 4;

        NodeDemo result = reverseSublist(head, left, right);

        // Print the modified linked list
        NodeDemo temp = result;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(); // Print a newline for better formatting
    }

    public static NodeDemo reverseSublist(NodeDemo head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        NodeDemo dummy = new NodeDemo(0);
        dummy.next = head;
        NodeDemo prev = dummy;

        // Move prev to the node before the left position
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        NodeDemo curr = prev.next;

        // Reverse the sublist
        for (int i = 0; i < right - left; i++) {
            NodeDemo next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }

        return dummy.next;
    }
}
