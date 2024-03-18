package org.example.ED.LinkedList;

public class Node {
    private Object object;
    private Object next;

    public Node(Object object, Object next) {
        this.object = object;
        this.next = next;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getNext() {
        return next;
    }

    public void setNext(Object next) {
        this.next = next;
    }
}
