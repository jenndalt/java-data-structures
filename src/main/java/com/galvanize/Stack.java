package com.galvanize;

public class Stack {
    // head/top of the stack
    Node head;
    int count = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(Node node) {
        this.head = node;
        count++;
    }


    public int count() {
        return this.count;
    }

    public Node pop() {
        count--;
        return this.head;
    }


    public Node peek() {
        return this.head;
    }
}
