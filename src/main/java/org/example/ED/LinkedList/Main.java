package org.example.ED.LinkedList;

import org.example.ED.LinkedList.SimpleLinkedList.SimpleLinkedList;

public class Main {
    public static void main(String[] args) {
        SimpleLinkedList SimpleLinkedList = new SimpleLinkedList();
        SimpleLinkedList.add(1);
        SimpleLinkedList.add(2);
        SimpleLinkedList.add(3);
        SimpleLinkedList.add(4);
        SimpleLinkedList.add(0, 5);
        SimpleLinkedList.remove(3);

        System.out.println(SimpleLinkedList.getNode(0));
    }
}
