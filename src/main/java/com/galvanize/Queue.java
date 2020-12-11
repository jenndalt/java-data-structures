package com.galvanize;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Queue {
    List qList = new ArrayList<Node>();
    Node rear;
    Node tail;
    int count = 0;
    public boolean isEmpty() {
        return tail == null;
    }
    public void enqueue(Node node) {
        this.tail = node;
        this.qList.add(node);
        this.rear = node;
        this.count++;
    }
    public int length() {
        return this.count;
    }
    public Object getFront() {
        return this.qList.get(0);
    }
    public Node getRear() {
        return this.rear;
    }
    public Node dequeue() {
        Node temp = (Node) this.qList.get(0);
        this.qList.remove(0);
        this.count--;
        return temp;
    }
}