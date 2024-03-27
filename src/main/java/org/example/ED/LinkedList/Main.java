package org.example.ED.LinkedList;

import org.example.ED.LinkedList.SimpleLinkedCircularList.SimpleLinkedCircularList;

public class Main {
    public static void main(String[] args) {
        SimpleLinkedCircularList simpleLinkedCircularList = new SimpleLinkedCircularList();
        simpleLinkedCircularList.add(0,1);
        simpleLinkedCircularList.add(1,3);
        simpleLinkedCircularList.add(1,2);
        simpleLinkedCircularList.add(3,4);
        simpleLinkedCircularList.add(5);
        simpleLinkedCircularList.add(6);

        for(int i = 0; i < simpleLinkedCircularList.size(); i++) {
            System.out.println(simpleLinkedCircularList.getNode(i));
        }
    }
}
