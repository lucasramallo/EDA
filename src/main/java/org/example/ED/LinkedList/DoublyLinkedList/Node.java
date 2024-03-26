package org.example.ED.LinkedList.DoublyLinkedList;

public class Node {
    private int value;
    private Node next;
    private Node previous;

    public Node(int object, Node next) {
        this.value = object;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        String nextNodeStr = (this.next != null) ? "Next value: " + this.next.getValue() : "Next value: " + null;
        String previousNodeStr = (this.previous != null) ? "previous: " + this.previous.getValue() : "previous: " + null;
        return "Node{" +
                "value = " + value +
                ", " + previousNodeStr +
                ", " + nextNodeStr +
                '}';
    }

}
