package com.exercise.herenciainmuebles;

public class CasaConjunto extends CasasUrbanas{
    double administracion;
    boolean areasComunes;

    public static double valorArea = 2500000;

    public CasaConjunto(int identificadorInmobiliario, int area, String direccion, double precioVenta, int numeroDeHabitaciones, int numeroDeBaños, int pisosQuePoseen, double administracion, boolean areasComunes) {
        super(identificadorInmobiliario, area, direccion, precioVenta, numeroDeHabitaciones, numeroDeBaños, pisosQuePoseen);
        this.administracion = administracion;
        this.areasComunes = areasComunes;
    }

    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administración = " + administracion);
        System.out.println("Tiene áreas comunes? = " + areasComunes);
        System.out.println();
    }
}
