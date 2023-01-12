package com.exercise.herenciainmuebles;

public class CasasUrbanas extends Casas{


    public CasasUrbanas(int identificadorInmobiliario, int area, String direccion, double precioVenta, int numeroDeHabitaciones, int numeroDeBaños, int pisosQuePoseen) {
        super(identificadorInmobiliario, area, direccion, precioVenta, numeroDeHabitaciones, numeroDeBaños, pisosQuePoseen);

    }

    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
    }
}
