package com.exercise.herenciainmuebles;

public class Apartaestudio extends Apartamentos{
    int numeroDeHabitaciones=1;

    public static double valorArea =1500000;

    public Apartaestudio(int identificadorInmobiliario, int area, String direccion, double precioVenta, int numeroDeHabitaciones, int numeroDeBaños, int numeroDeHabitaciones1) {
        super(identificadorInmobiliario, area, direccion, precioVenta, numeroDeHabitaciones, numeroDeBaños);
        this.numeroDeHabitaciones = numeroDeHabitaciones1;
    }

    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }
}
