package org.example.HashTable.hashTable;

public class HashTable {
    Aluno[] list;
    int SIZE;

    public HashTable(int initialSize) {
        this.SIZE = initialSize;
        this.list = new Aluno[SIZE];
    }

    public void add(int key, Aluno aluno) {
        int hashedIndex = keyToHash(key);
        boolean needResize = true;

        for(int i = hashedIndex; i < this.SIZE; i++) {
            if(this.list[i] == null || this.list[hashedIndex].getMatricula() == -1) {
                this.list[i] = aluno;
                needResize = false;
                break;
            }
        }

        if(needResize) {
            resize(aluno);
        }
    }

    public String get(int key) {
        Aluno aluno = getAluno(key);

        if(aluno != null) {
            return aluno.getNome();
        }

        return null;
    }

    private Aluno getAluno(int key) {
        int hashedIndex = keyToHash(key);

        for(int i = hashedIndex; i < this.SIZE; i++) {
            Aluno aluno = list[i];

            if(aluno == null) {
                throw new RuntimeException("Valor não encontrado!");
            }

            if (aluno.getMatricula() == key) {
                return aluno;
            }
        }

        return null;
    }

    public void remove(int key) {
        Aluno aluno = getAluno(key);
        if(aluno != null) {
            aluno.setMatricula(-1);
            aluno.setNome(null);
        }
    }

    public void resize(Aluno aluno) {
        int halfSize = SIZE;
        Aluno[] listCopy = list.clone();
        this.list = new Aluno[SIZE * 2];
        this.SIZE = this.SIZE * 2;

        for (int i = 0; i < halfSize; i++) {
            if(listCopy[i] != null && listCopy[i].getMatricula() != -1) {
                add(listCopy[i].getMatricula(), listCopy[i]);
            }
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
