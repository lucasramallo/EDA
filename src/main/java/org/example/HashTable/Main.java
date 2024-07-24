package org.example.HashTable;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(20);

        Aluno aluno = new Aluno(202019, "Lucas");
        Aluno aluno2 = new Aluno(202019, "Ana");
        Aluno aluno3 = new Aluno(202120, "Matheus");
        Aluno aluno4 = new Aluno(202421, "Rebeca");
        Aluno aluno5 = new Aluno(202022, "Gustavo");
        Aluno aluno6 = new Aluno(202023, "Mario");

        hashTable.add(aluno);
        hashTable.add(aluno2);
        hashTable.add(aluno3);
        hashTable.add(aluno4);
        hashTable.add(aluno5);
        hashTable.add(aluno6);

        hashTable.print();
    }
}
