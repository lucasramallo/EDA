package org.example.LinkedList.CircularSimpleLinkedList;

public class Node {
    private int value;
    private Node next;

    public Node(int object) {
        this.value = object;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
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
        return "Node{" +
                "value = " + value +
                ", " + nextNodeStr +
                '}';
    }

}