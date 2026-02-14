class Stacks {
    int max = 10;
    int[] arr = new int[max];
    int top = -1;

    // Push operation
    void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            arr[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    // Pop operation
    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return arr[top--];
        }
    }

    // Peek operation
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[top];
        }
    }

    // Check if empty
    boolean isEmpty() {
        return top == -1;
    }

    // Check if full
    boolean isFull() {
        return top == max - 1;
    }

    // Display stack
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    // Main method to test
    public static void main(String[] args) {
        Stacks s = new Stacks();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();

        System.out.println("Top element: " + s.peek());
        System.out.println("Popped: " + s.pop());

        s.display();
    }
}
