package org.example.HashTable;


import org.example.HashTable.SimpleLinkedList.SimpleLinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class HashTable {
    private final int sizeLimit;
    private SimpleLinkedList[] list;

    public HashTable(int sizeLimit) {
        this.sizeLimit = sizeLimit;
        this.list = new SimpleLinkedList[sizeLimit];

        for(int i = 0; i < sizeLimit; i++) {
            list[i] = new SimpleLinkedList();
        }
    }

    public boolean add(Aluno aluno) {
        int hashedIndex = keyToHash(aluno.getMatricula());
        SimpleLinkedList linkedList = new SimpleLinkedList();

        list[hashedIndex].add(aluno);

        return true;
    }

    private int keyToHash(int key) {
        return key % sizeLimit;
    }

    public void print() {
        String bottom = "└-----------------------┘";

        for(int i = 0; i < list.length; i++) {
            System.out.println("┌-----------" + i + "-----------┐");
            SimpleLinkedList el = list[i];
            for(int j = 0; j < el.size(); j++) {
                System.out.println("  " + j + ": " + el.getNode(j).getValue().getMatricula() + " " + el.getNode(j).getValue().getNome());
            }

            if(i > 9) {
                bottom = "└------------------------┘";
            }

            System.out.println(bottom);
        }
    }
}
