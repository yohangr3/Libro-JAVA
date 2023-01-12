package com.exercise.herenciainmuebles;

public class inmuebles  {
    int identificadorInmobiliario;
    int area;
    String direccion;

    double precioVenta;

    public inmuebles(int identificadorInmobiliario, int area, String direccion, double precioVenta) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
        this.precioVenta = precioVenta;
    }

    public double calcularPrecioDeVenta(double valorArea){
        precioVenta = area*valorArea;
        return precioVenta;
    }

    void imprimir() {
        System.out.println("Identificador inmobiliario = " + identificadorInmobiliario);
        System.out.println("Area = " + area);
        System.out.println("Dirección = " + direccion);
        System.out.println("Precio de venta = $" + precioVenta);
    }
}
