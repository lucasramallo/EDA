package org.example.Sorting;

import java.util.Arrays;

class RadixSort {
    public static void ordenacaoContagem(int array[], int tamanho, int posicao) {
        int[] saida = new int[tamanho + 1];
        int maximo = array[0];
        for (int i = 1; i < tamanho; i++) {
            if (array[i] > maximo)
                maximo = array[i];
        }

        int[] contador = new int[maximo + 1];

        for (int i = 0; i < maximo; ++i) {
            contador[i] = 0;
        }

        for (int i = 0; i < tamanho; i++) {
            contador[(array[i] / posicao) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            contador[i] += contador[i - 1];
        }

        for (int i = tamanho - 1; i >= 0; i--) {
            saida[contador[(array[i] / posicao) % 10] - 1] = array[i];
            contador[(array[i] / posicao) % 10]--;
        }

        for (int i = 0; i < tamanho; i++) {
            array[i] = saida[i];
        }
    }

    static int getMax(int array[], int n) {
        int maximo = array[0];
        for (int i = 1; i < n; i++)
            if (array[i] > maximo)
                maximo = array[i];
        return maximo;
    }

    static void ordenarRadix(int array[], int tamanho) {
        int maximo = getMax(array, tamanho);

        for (int posicao = 1; maximo / posicao > 0; posicao *= 10)
            ordenacaoContagem(array, tamanho, posicao);
    }

    // Código de teste
    public static void main(String args[]) {
        int[] dados = { 5, 6, 2, 898, 76, 543, 0 };
        int tamanho = dados.length;
        ordenarRadix(dados, tamanho);
        System.out.println(Arrays.toString(dados));
    }
}
