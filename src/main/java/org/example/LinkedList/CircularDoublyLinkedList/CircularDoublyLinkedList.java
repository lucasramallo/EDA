package org.example.LinkedList.CircularDoublyLinkedList;

public class CircularDoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public CircularDoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean add(int index, int value) {
        if(index <= this.size && index >= 0) {
            Node node = new Node(value);

            if(index == 0 && this.size > 0) {
                node.setNext(this.head);
                this.head.setPrevious(node);
                this.head.setNext(node);
                this.head = node;

                this.size++;
                linkingTailAndHead();

                return true;
            }

            if(index == 0) {
                node.setNext(head);
                node.setPrevious(null);
                this.head = node;
                this.tail = node;
                this.size++;
                linkingTailAndHead();

                return true;
            }

            Node previousNode = getNode(index -1);
            Node oldNode = getNode(index);

            if(oldNode == null) {
                previousNode.setNext(node);
                node.setPrevious(previousNode);
                this.tail = node;
                linkingTailAndHead();
                this.size++;

                return true;
            }

            previousNode.setNext(node);
            node.setNext(oldNode);
            node.setPrevious(previousNode);
            oldNode.setPrevious(node);

            linkingTailAndHead();
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
            node.setPrevious(this.tail);
        }
        this.tail = node;
        linkingTailAndHead();
        this.size++;
    }

    public boolean remove(int index) {
        if(index == 0) {
            Node nextNode = getNode(1);
            this.head.setNext(null);
            nextNode.setPrevious(null);
            this.head = nextNode;

            linkingTailAndHead();
            this.size--;
            return true;
        }

        Node previousNode = getNode(index - 1);
        Node nodeToRemove = getNode(index);
        Node nextNode = getNode(index + 1);

        previousNode.setNext(nextNode);
        nextNode.setPrevious(previousNode);

        nodeToRemove.setNext(null);
        nodeToRemove.setPrevious(null);

        linkingTailAndHead();
        size--;
        return true;
    }

    private void linkingTailAndHead() {
        this.tail.setNext(this.head);
        this.head.setPrevious(this.tail);
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
