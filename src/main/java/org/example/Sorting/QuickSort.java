package org.example.Sorting;
import java.util.List;

public class QuickSort {
    public static int[] quickSort(int[] array, int begin, int end) {
        if(begin < end) {
            int q = partition(array, begin, end);
            quickSort(array, begin, q - 1);
            quickSort(array, q + 1, end);
        }
        return array;
    }

    public static int partition(int[] array, int begin, int end) {
        int x = array[end];
        int i = begin - 1;
        for(int j = begin; j <= end - 1; j++) {
            if(array[j] <= x) {
                i = i + 1;
                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
        }

        int aux = array[i + 1];
        array[i + 1] = array[end];
        array[end] = aux;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 8, 3, 5, 56, 34, 0, 32, 7};
        int[] sortedArray = quickSort(array, 0, array.length - 1);
        for(int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
