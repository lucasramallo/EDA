package org.example;

import java.lang.reflect.Array;

public class Example {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};

        for(int i = 0; i < n.length; i++) {
            for(int j = 0; j < n.length; j++) {
                System.out.println(j);
            }
        }
    }
}
