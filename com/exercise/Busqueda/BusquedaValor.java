package com.exercise.Busqueda;

import java.util.Scanner;

public class BusquedaValor {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9,3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número que desea buscar: ");
        int n = sc.nextInt();
        int contador = 0;
        for (int i: arr){
            if (n ==arr[i]){
                contador++;

            }
        }
        System.out.println("El número " + n + " esta " + contador + " veces");

    }
}
