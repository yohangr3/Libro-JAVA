package com.exercise.herenciainmuebles;

public class Apartamentos extends InmuebleVivienda{

    public Apartamentos(int identificadorInmobiliario, int area, String direccion, double precioVenta, int numeroDeHabitaciones, int numeroDeBaños) {
        super(identificadorInmobiliario, area, direccion, precioVenta, numeroDeHabitaciones, numeroDeBaños);
    }

    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
    }
}
