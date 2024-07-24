package org.example.HashTable.SimpleLinkedList;

import org.example.HashTable.Aluno;

public class Node {
    private Aluno value;
    private Node next;

    public Node(Aluno object) {
        this.value = object;
        this.next = null;
    }

    public Aluno getValue() {
        return value;
    }

    public void setValue(Aluno value) {
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
