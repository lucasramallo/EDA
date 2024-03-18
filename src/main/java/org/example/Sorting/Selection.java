package org.example.Sorting;

public class Selection {
    //(1, 4, 5, 0, 7, 2)

    public static void main(String[] args) {
        int[] list = {1, 9, 4, 7, 3, 2, 48, 812, 738, 876, 33, 34, 0, 54};
        selectionSort(list);

        System.out.println(listToString(list));
    }

    public static int[] selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++){
            int menor = i;
            for (int j = i + 1; j < list.length; j++){
                if(list[j] < list[menor]) {
                    menor = j;
                }
            }

            int aux = list[i];
            list[i] = list[menor];
            list[menor] = aux;
        }

        return list;
    }

    public static String listToString(int[] list) {
        String string = "";
        for(int number : list) {
            string += number + " ";
        }

        return string;
    };
}