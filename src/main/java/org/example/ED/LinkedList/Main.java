package org.example.ED.LinkedList;

import org.example.ED.LinkedList.LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.add(0,1);
        doublyLinkedList.add(1,2);
        doublyLinkedList.add(2,3);

        System.out.println(doublyLinkedList.getNode(2));
    }
}
