class Stacks {
    int max = 20;
    int[] arr = new int[max];
    int top = -1;

    // Add / Push
    void add(int value) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = value;
    }

    // Remove / Pop
    int remove() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    // Peek
    int peek() {
        if (top == -1) {
            System.out.println("Stack Empty");
            return -1;
        }
        return arr[top];
    }

    // Traverse
    void traverse() {
        if (top == -1) {
            System.out.println("Stack Empty");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    // Add at any index
    void addAtIndex(int idx, int value) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        if (idx < 0 || idx > top + 1) {
            System.out.println("Invalid Index");
            return;
        }

        for (int i = top; i >= idx; i--) {
            arr[i + 1] = arr[i];
        }

        arr[idx] = value;
        top++;
    }

    // Remove at any index
    void removeAtIndex(int idx) {
        if (top == -1) {
            System.out.println("Stack Empty");
            return;
        }
        if (idx < 0 || idx > top) {
            System.out.println("Invalid Index");
            return;
        }

        for (int i = idx; i < top; i++) {
            arr[i] = arr[i + 1];
        }
        top--;
    }

    public static void main(String[] args) {
        Stacks s = new Stacks();

        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);

        s.traverse();

        System.out.println("Peek: " + s.peek());

        s.addAtIndex(2, 25);
        s.traverse();

        s.removeAtIndex(1);
        s.traverse();

        System.out.println("Removed top: " + s.remove());
        s.traverse();
    }
}
