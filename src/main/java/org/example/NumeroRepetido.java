package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class NumeroRepetido {

    // Verificar se existem números repetidos no Array.

    public static void main(String[] args) {
        ArrayList list = new ArrayList<Integer>();
        list.addAll(Arrays.asList(1, 4, 6, 8, 3, 1));


        System.out.println(verificarNumeroRepetidoIterativo(list));
        System.out.println(verificarNumeroRepetidoIterativo2(list));
        System.out.println(verificarNumeroRepetidoRecursivo(list));
    }

    public static boolean verificarNumeroRepetidoIterativo(ArrayList list) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++){
            int number = (int) list.get(i);
            if (map.get(number) != null) {
                return true;
            }
            map.put(number, i);
        }

        return false;
    }

    public static boolean verificarNumeroRepetidoIterativo2(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i != j && list.get(i) == list.get(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean verificarNumeroRepetidoRecursivo(ArrayList list) {
        if (list.size() == 1) {
            return false;
        }

        int curr = (int) list.remove(0);

        if (list.contains(curr)) {
            return true;
        }

        return verificarNumeroRepetidoRecursivo(list);
    }

}
