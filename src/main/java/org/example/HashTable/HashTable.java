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

    public boolean add(int key, Aluno value) {
        int hashedIndex = keyToHash(key);
        SimpleLinkedList linkedList = new SimpleLinkedList();

        list[hashedIndex].add(value);

        return true;
    }

    public String get(int matricula) {
        int hashedIndex = keyToHash(matricula);
        SimpleLinkedList column = list[hashedIndex];

        for(int i = 0; i < column.size(); i++) {
            Aluno aluno = column.get(i);
            if(aluno.getMatricula() == matricula) {
                return aluno.getNome();
            }
        }

        throw new RuntimeException("Valor não encontrado!");
    }

    public String remove(int matricula) {
        int hashedIndex = keyToHash(matricula);
        SimpleLinkedList column = list[hashedIndex];

        for(int i = 0; i < column.size(); i++) {
            Aluno aluno = column.get(i);
            if(aluno.getMatricula() == matricula) {
                column.remove(i);
                return aluno.getNome();
            }
        }

        throw new RuntimeException("Valor não encontrado!");
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
