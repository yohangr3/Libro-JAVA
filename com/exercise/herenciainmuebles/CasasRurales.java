package com.exercise.herenciainmuebles;

public class CasasRurales extends Casas{

    double distanciaCabeceraMunicipal;
    double alturaSobreNivelDelMar;

    public static double valorArea = 1500000;

    public CasasRurales(int identificadorInmobiliario, int area, String direccion, double precioVenta, int numeroDeHabitaciones, int numeroDeBaños, int pisosQuePoseen, double distanciaCabeceraMunicipal, double alturaSobreNivelDelMar) {
        super(identificadorInmobiliario, area, direccion, precioVenta, numeroDeHabitaciones, numeroDeBaños, pisosQuePoseen);
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
        this.alturaSobreNivelDelMar = alturaSobreNivelDelMar;
    }

    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Distancia la cabecera municipal = " + numeroDeHabitaciones+ " km.");
        System.out.println("Altitud sobre el nivel del mar = " + alturaSobreNivelDelMar +" metros.");
        System.out.println();
    }
}
