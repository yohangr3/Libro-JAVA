package com.exercise.herenciainmuebles;

public class CasaIndependiente extends CasasUrbanas{

    public static double valorArea =3000000;

    public CasaIndependiente(int identificadorInmobiliario, int area, String direccion, double precioVenta, int numeroDeHabitaciones, int numeroDeBaños, int pisosQuePoseen) {
        super(identificadorInmobiliario, area, direccion, precioVenta, numeroDeHabitaciones, numeroDeBaños, pisosQuePoseen);
    }

    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }
}
