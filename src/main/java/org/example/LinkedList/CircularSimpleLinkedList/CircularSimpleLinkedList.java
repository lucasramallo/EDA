package org.example.LinkedList.CircularSimpleLinkedList;

public class CircularSimpleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CircularSimpleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean add(int index, int value) {
        if(index <= this.size && index >= 0) {
            Node node = new Node(value);

            if(index == 0 && this.size > 0) {
                node.setNext(this.head);
                this.head.setNext(node);
                this.head = node;

                this.size++;
                linkingTailToHead();

                return true;
            }

            if(index == 0) {
                node.setNext(head);
                this.head = node;
                this.tail = node;
                this.size++;
                linkingTailToHead();

                return true;
            }

            Node previousNode = getNode(index -1);
            Node oldNode = getNode(index);

            if(oldNode == null) {
                previousNode.setNext(node);
                this.tail = node;
                linkingTailToHead();
                this.size++;

                return true;
            }

            previousNode.setNext(node);
            node.setNext(oldNode);

            linkingTailToHead();
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
        linkingTailToHead();
        this.size++;
    }

    public boolean remove(int index) {
        if(index == 0) {
            Node nextNode = getNode(1);
            this.head.setNext(null);
            this.head = nextNode;

            linkingTailToHead();
            this.size--;
            return true;
        }

        Node previousNode = getNode(index - 1);
        Node nodeToRemove = getNode(index);
        Node nextNode = getNode(index + 1);

        previousNode.setNext(nextNode);

        nodeToRemove.setNext(null);

        linkingTailToHead();
        size--;
        return true;
    }

    private void linkingTailToHead() {
        this.tail.setNext(this.head);
    }

    public Node getNode(int index) {
        Node node = this.head;
        for(int i = 0; i < index; i++) {
            if (node.getNext() == null || node.getNext() == this.head) {
                return null;
            }
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

    public int size() {
        return this.size;
    }
}
