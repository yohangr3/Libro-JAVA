package com.exercise.herenciainmuebles;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        ApartamentoFamiliar apto1 = new ApartamentoFamiliar(103067,120,"Avenida Santander 45-45",200000,2,3,50000);
        System.out.println("Datos apartamento");
        apto1.calcularPrecioDeVenta(apto1.valorArea);
        apto1.imprimir();
        System.out.println("Datos apartamento");
        Apartaestudio aptestudio1 = new Apartaestudio(12354,50,"Avenida Caracas 30-15",150000,1,1,1);
        aptestudio1.calcularPrecioDeVenta(aptestudio1.valorArea);
        aptestudio1.imprimir();
    }
}
