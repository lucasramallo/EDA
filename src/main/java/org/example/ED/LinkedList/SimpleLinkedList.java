package org.example.ED.LinkedList;

import java.util.ArrayList;

public class SimpleLinkedList {
    private Node head;
    private Node tail;
    private ArrayList<Node> nodes;

    public SimpleLinkedList() {
        this.head = null;
        this.tail = null;
        this.nodes = new ArrayList<>();
    }

    public void add(Object objectToAdd) {
        Node node = new Node(objectToAdd, null);
        nodes.add(node);
    }

    private void setHead(Node node) {
        this.head = node;
    }
}
