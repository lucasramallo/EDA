package org.example.ED.LinkedList;

import org.example.ED.LinkedList.DoublyLinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.add(0,1);
        doublyLinkedList.add(1,2);
        doublyLinkedList.add(2,4);
        doublyLinkedList.add(2,3);
        doublyLinkedList.add(5);
        doublyLinkedList.add(6);

        for(int i = 0; i < doublyLinkedList.size(); i++) {
            System.out.println(doublyLinkedList.getNode(i));
        }
    }
}
