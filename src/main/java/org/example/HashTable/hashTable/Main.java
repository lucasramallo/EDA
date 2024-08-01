package org.example.HashTable.hashTable;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(5);

        hashTable.add(202401, new Aluno(202401, "Lucas"));
        hashTable.add(202401, new Aluno(202401, "Pedro"));
        hashTable.add(202401, new Aluno(202401, "Maria"));
        hashTable.add(202024, new Aluno(202024, "Juliana"));
        hashTable.add(202025, new Aluno(202025, "Thiago"));
        hashTable.add(202026, new Aluno(202026, "Mariana"));
        hashTable.add(202027, new Aluno(202027, "Rafael"));
        hashTable.add(202028, new Aluno(202028, "Beatriz"));
        hashTable.add(202029, new Aluno(202029, "Fernanda"));
        hashTable.add(202030, new Aluno(202030, "Gabriel"));
        hashTable.add(202031, new Aluno(202031, "Aline"));
        hashTable.add(202032, new Aluno(202032, "Eduardo"));
        hashTable.add(202033, new Aluno(202033, "Camila"));
        hashTable.add(202034, new Aluno(202034, "Pedro"));
        hashTable.add(202035, new Aluno(202035, "Larissa"));
        hashTable.add(202036, new Aluno(202036, "Felipe"));
        hashTable.add(202037, new Aluno(202037, "Isabela"));
        hashTable.add(202038, new Aluno(202038, "Vinicius"));
        hashTable.add(202039, new Aluno(202039, "Tatiana"));
        hashTable.add(202040, new Aluno(202040, "Mauricio"));

        hashTable.remove(202024); // juliana
        hashTable.add(202024, new Aluno(202024, "Filipe"));
        System.out.println(hashTable.get(202040));


        hashTable.print();
    }
}
