package org.example.ED.LinkedList;

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
            Node node = new Node(value, null);
            if(index == 0) {
                node.setNext(head);
                this.head = node;
            } else {
                Node previousNode = this.head;
                for(int i = 1; i < index; i++) {
                    previousNode = previousNode.getNext();
                }
                Node oldNode = previousNode.getNext();

                previousNode.setNext(node);
                node.setNext(oldNode);
            }
            this.size += 1;
            return true;
        }
        return false;
    }

    public void add(int value) {
        Node node = new Node(value, null);
        if(this.size == 0) {
            this.head = node;
        } else {
            this.tail.setNext(node);
        }
        this.tail = node;
        this.size += 1;
    }

    private void setHead(Node node) {
        this.head = node;
    }

    public int get(int index) {
        Node node = this.head;
        for(int i = 0; i < index; i++) {
            node = node.getNext();
        }

        return node.getValue();
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int size() {
        return this.size;
    }
}
