package Queues;

import java.util.NoSuchElementException;

public class LLImplementationOfQueue {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(10); q.add(20); q.add(30); q.add(40);
        q.display();
        System.out.println(q.remove());
        q.display();
    }
}

class MyQueue {
    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    void add(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    int remove() {
        if (front == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        int removedValue = front.value;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return removedValue;
    }

    void display() {
        Node current = front;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    int size() {
        return size;
    }
}