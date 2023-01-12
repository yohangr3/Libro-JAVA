package com.exercise.herenciainmuebles;

public class Locales extends inmuebles{
    enum localizacion{
        interno,calle
    }
    localizacion localizacion;

    public Locales(int identificadorInmobiliario, int area, String direccion, double precioVenta, Locales.localizacion localizacion) {
        super(identificadorInmobiliario, area, direccion, precioVenta);
        this.localizacion = localizacion;
    }

    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Tipo de local = " + localizacion);
    }
}
