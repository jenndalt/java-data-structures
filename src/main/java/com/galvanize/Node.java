package com.galvanize;

import java.util.ArrayList;
import java.util.List;

/*
    Node

    Nodes are the individual units contained in a head structure.

    A node is a value object, representing any type of value and
    providing a reference to the next node.
 */
public class Node {
    public Node(){}
    public Node(Object data) {
        this.value=data;
    }

    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
    Object value;

}