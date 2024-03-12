package org.example;

public class Main {
    public static void main(String[] args) {
        imprimirPares(10);
    }

    public static void imprimirPares(int n) {
        if (n >= 0) {
            imprimirPares(n-1);
            if((n % 2) == 0){
                System.out.println(n);
            }
        }
    }
}