package org.example.HashTable.hashTable;

public class HashTable {
    Aluno[] list;
    int SIZE = 20;

    public HashTable() {
        this.list = new Aluno[SIZE];
    }

    public void add(int key, Aluno aluno) {
        int hashedIndex = keyToHash(key);

        if(this.list[hashedIndex] == null) {
            this.list[hashedIndex] = aluno;
        } else {
            for(int i = hashedIndex; i < this.SIZE; i++) {

                if(this.list[SIZE - 1] != null) resize(aluno);

                if(this.list[i] == null) {
                    this.list[i] = aluno;
                    break;
                }

            }
        }

    }

    public void resize(Aluno aluno) {
        int halfSize = SIZE;
        Aluno[] listCopy = list.clone();
        this.list = new Aluno[SIZE * 2];
        this.SIZE = this.SIZE * 2;

        for (int i = 0; i < halfSize - 1; i++) {
            if(listCopy[i] != null) add(listCopy[i].getMatricula(), listCopy[i]);
        }

        add(aluno.getMatricula(), aluno);

    }

    private int keyToHash(int key) {
        return key % this.SIZE;
    }

    public void print() {
        String bottom = "└-----------------------┘";

        for(int i = 0; i < list.length; i++) {
            System.out.println("┌-----------" + i + "-----------┐");
            if(list[i] != null) {
                System.out.println("key: " + list[i].getMatricula() + " value : " + list[i].getNome());
            } else{
                System.out.println(list[i]);
            }

            if(i > 9) {
                bottom = "└------------------------┘";
            }

            System.out.println(bottom);
        }
    }
}
