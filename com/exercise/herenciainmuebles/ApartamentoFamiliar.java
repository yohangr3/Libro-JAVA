package com.exercise.herenciainmuebles;

public class ApartamentoFamiliar extends Apartamentos{
    double administracion;

    public static double valorArea =2000000;

    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, double precioVenta, int numeroDeHabitaciones, int numeroDeBaños, double administracion) {
        super(identificadorInmobiliario, area, direccion, precioVenta, numeroDeHabitaciones, numeroDeBaños);
        this.administracion = administracion;
    }

    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administración = $" + administracion);
        System.out.println();
    }
}
