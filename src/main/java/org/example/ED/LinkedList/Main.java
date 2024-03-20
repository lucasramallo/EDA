package org.example.ED.LinkedList;

public class Main {
    public static void main(String[] args) {
        SimpleLinkedList linkedList = new SimpleLinkedList();
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(3);
//        linkedList.add(4);
        linkedList.add(0, 5);
        linkedList.add(1, 6);

        System.out.println(linkedList.getHead());
        System.out.println("Head: " + linkedList.getHead());
//        System.out.println(linkedList.get(2));
    }
}
