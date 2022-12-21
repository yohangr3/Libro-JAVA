package com.exercise.ArrayMayorMenor;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MayorMenor {
    public static void main(String[] args) {
        int[] array = {10,11,2,3,50,34};
        Arrays.sort(array);
        int mayor =0;
        int menor = 0;

        for (int i = 0; i < array.length; i++) {
            mayor = array[array.length-1];
            menor = array[0];

        }
        System.out.println("menor " + menor + " mayor " + mayor);

    }
}
