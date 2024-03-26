package org.example.ED.LinkedList.DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean add(int index, int value) {
        if(index <= this.size && index >= 0) {
            Node node = new Node(value, null);
            if(index == 0) {
                node.setNext(head);
                node.setPrevious(null);
                this.head = node;
                this.size++;
                return true;
            }

            Node previousNode = getNode(index -1);
            Node oldNode = getNode(index);

            if(oldNode == null) {
                previousNode.setNext(node);
                node.setPrevious(previousNode);
                this.tail = node;
                this.size++;

                return true;
            }

            previousNode.setNext(node);
            node.setNext(oldNode);
            node.setPrevious(previousNode);
            oldNode.setPrevious(node);

            this.size++;
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
            node.setPrevious(this.tail);
        }
        this.tail = node;
        this.size++;
    }

    public boolean remove(int index) {
        if(index == 0) {
            Node nextNode = getNode(1);
            this.head.setNext(null);
            nextNode.setPrevious(null);
            this.head = nextNode;

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

        size--;
        return true;
    }

    public Node getNode(int index) {
        Node node = this.head;
        for(int i = 0; i < index; i++) {
            if (node.getNext() == null) {
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
