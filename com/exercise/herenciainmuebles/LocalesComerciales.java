package com.exercise.herenciainmuebles;

public class LocalesComerciales extends Locales {
    String centroComercial;

    public static double valorArea =3000000;

    public LocalesComerciales(int identificadorInmobiliario, int area, String direccion, double precioVenta, Locales.localizacion localizacion, String centroComercial) {
        super(identificadorInmobiliario, area, direccion, precioVenta, localizacion);
        this.centroComercial = centroComercial;
    }

    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Centro comercial = " + centroComercial);
        System.out.println();
    }
}
