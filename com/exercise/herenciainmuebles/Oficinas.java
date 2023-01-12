package com.exercise.herenciainmuebles;

public class Oficinas extends Locales{
    boolean propiedadDelGobierno;

    public static double valorArea =3500000;

    public Oficinas(int identificadorInmobiliario, int area, String direccion, double precioVenta, Locales.localizacion localizacion, boolean propiedadDelGobierno) {
        super(identificadorInmobiliario, area, direccion, precioVenta, localizacion);
        this.propiedadDelGobierno = propiedadDelGobierno;
    }

    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Es oficina gubernamental = " + propiedadDelGobierno);
        System.out.println();
    }
}
