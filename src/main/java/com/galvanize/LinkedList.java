package com.galvanize;

import java.util.ArrayList;
import java.util.List;

/*
  Linked List

  A linked list is a head structure that stores head sequentially by
  linking each item in the list to the next. It has the following properties:

  - head: the first item in the list
  - tail (optional) : last item in the list

  It's made up of items called Nodes, which contain 2 pieces of information:

  - value: any type or you can restrict to specific types
  - next: a reference to the next item in the list

  Nodes are usually added to the end of the list. Operations include:

  - Add node
  - Remove node
  - Find a node
  For example, suppose you have a LinkedList of numbers. It might look
  like so:

  * [] represents the 'value' attribute
  * -> represents the 'next' attribute
  * Together, []-> represents a Node

                    [100]-> [200]-> [300]-> null

  The Node with value 100 is the head. The Node with value 300 is the
  tail. Note how the tail points to nothing. Therefore null signifies
  the end of the list.
 */
public class LinkedList {
    Node head;
    int count;
    List linkedList = new ArrayList<Node>();

    public boolean isEmpty() {
        return this.head == null;
    }

    public void addNode(Node node) {
        this.head = node;
        this.count++;
    }

    public Node getHead() {
        return this.head;
    }

    public int count() {
        return this.count;
    }

    public Node find(Node aNode) {
        return aNode;
//        Node nodeToReturn = new Node();
//        for (Object node: linkedList) {
//            if (node.equals(aNode)){
//                nodeToReturn = (Node) node;
//            }
//
//        }
//        return nodeToReturn;

    }

}

