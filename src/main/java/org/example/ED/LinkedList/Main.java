package org.example.ED.LinkedList;

import org.example.ED.LinkedList.CircularDoublyLinkedList.CircularDoublyLinkedList;
import org.example.ED.LinkedList.CircularSimpleLinkedList.CircularSimpleLinkedList;
import org.example.ED.LinkedList.DoublyLinkedList.DoublyLinkedList;
import org.example.ED.LinkedList.SimpleLinkedList.SimpleLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList circularDoublyLinkedList = new CircularDoublyLinkedList();
        circularDoublyLinkedList.add(0,1);
        circularDoublyLinkedList.add(1,3);
        circularDoublyLinkedList.add(1,2);
        circularDoublyLinkedList.add(3,4);
        circularDoublyLinkedList.add(5);
        circularDoublyLinkedList.add(6);

        for(int i = 0; i < circularDoublyLinkedList.size(); i++) {
            System.out.println(circularDoublyLinkedList.getNode(i));
        }
    }
}
