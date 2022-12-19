package com.exercise.NumeroAmstrong;

public class NumeroAmstrong {

    public static void main(String[] args) {
        /* Variables para el número original y su último dígito */
        int númeroOriginal, últimoDigito;
        // Cantidad de dígitos que tiene el número
        double dígitos;
        /* Variable que sumará los dígitos elevados a su cantidad de dígitos */
        double suma = 0;
        /* Número a determinar si es un número de Amstrong */
        int número = 371;
        /* Copia el valor del número para su procesamiento */
        númeroOriginal = número;
        /* Calcula el total de dígitos del número */
        dígitos = Math.floor(Math.log10(número)) + 1;
        // Calcula la suma de potencia de digitos
        while (número > 0) {
            últimoDigito = número % 10; // Extrae el último dígito
        // Calcula la suma de potencias del último dígito
            suma = suma + Math.pow(últimoDigito, dígitos);
            número = número / 10; // Elimina el último dígito
        }

        /**Verifica si es un número de Armstrong si la suma obtenida es igual al número **/
        if (númeroOriginal == suma) {
            System.out.println(númeroOriginal + " es un número de Amstrong");
        } else {
            System.out.println(númeroOriginal + " no es un número de Amstrong");
        }
    }
}
