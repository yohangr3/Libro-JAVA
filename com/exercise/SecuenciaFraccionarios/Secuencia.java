package com.exercise.SecuenciaFraccionarios;

import java.util.Scanner;

public class Secuencia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número : ");
        double n = sc.nextInt();
        double suma=0;
        for(double i=1;i <= n;i++){
            System.out.print("1/"+i );
            System.out.print(" + ");
            double x = 1/i;
            suma+=x;

        }

        System.out.println("\n" +"El resultado de la suma es: "+suma);



    }
}
