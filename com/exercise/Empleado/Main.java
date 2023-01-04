package com.exercise.Empleado;

public class Main {
    public static void main(String[] args) {

        Empleado empleado1= new Empleado("Yohan","Daza",100);
        Empleado empleado2= new Empleado("jodi","Daza",200);
        empleado1.imprimir();
        empleado2.imprimir();
        Empleado.totalSalario();

    }
}
