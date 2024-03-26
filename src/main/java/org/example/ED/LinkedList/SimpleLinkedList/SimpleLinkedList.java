package org.example.ED.LinkedList.SimpleLinkedList;

public class SimpleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SimpleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean add(int index, int value) {
        if(index <= this.size && index >= 0) {
            Node node = new Node(value);
            if(index == 0) {
                node.setNext(head);
                this.head = node;

                return true;
            }

            Node previousNode = getNode(index - 1);
            Node oldNode = getNode(index);

            previousNode.setNext(node);
            node.setNext(oldNode);

            this.size++;
            return true;
        }
        return false;
    }

    public void add(int value) {
        Node node = new Node(value);
        if(this.size == 0) {
            this.head = node;
        } else {
            this.tail.setNext(node);
        }
        this.tail = node;
        this.size++;
    }

    public boolean remove(int index) {
        if(index == 0) {
            Node nextNode = getNode(1);
            this.head.setNext(null);
            this.head = nextNode;

            this.size--;
            return true;
        }

        Node previousNode = getNode(index - 1);
        Node nodeToRemove = getNode(index);

        previousNode.setNext(nodeToRemove.getNext());
        nodeToRemove.setNext(null);

        size--;
        return true;
    }

    public Node getNode(int index) {
        Node node = this.head;
        for(int i = 0; i < index; i++) {
            node = node.getNext();
        }

        return node;
    }

    public int get(int index) {
        Node node = this.head;
        for(int i = 0; i < index; i++) {
            node = node.getNext();
        }

        return node.getValue();
    }

    private void setHead(Node node) {
        this.head = node;
    }

    private Node getHead() {
        return head;
    }

    private int getSize() {
        return size;
    }

    private void setSize(int size) {
        this.size = size;
    }

    private int size() {
        return this.size;
    }
}