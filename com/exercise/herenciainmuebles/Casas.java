package com.exercise.herenciainmuebles;

public class Casas extends InmuebleVivienda {

    int PisosQuePoseen ;

    public Casas(int identificadorInmobiliario, int area, String direccion, double precioVenta, int numeroDeHabitaciones, int numeroDeBaños, int pisosQuePoseen) {
        super(identificadorInmobiliario, area, direccion, precioVenta, numeroDeHabitaciones, numeroDeBaños);
        PisosQuePoseen = pisosQuePoseen;
    }

    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Número de pisos = " + PisosQuePoseen);
    }
}
