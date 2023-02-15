package com.exercise.relaciondeasociacionpeaje;

public class Moto extends Vehiculo{
    static int valorPeaje = 5000;

    public Moto(String placa) {
        super(placa);
    }

    public static int getValorPeaje() {
        return valorPeaje;
    }

    public static void setValorPeaje(int valorPeaje) {
        Moto.valorPeaje = valorPeaje;
    }
    void imprimir(){
        System.out.println("Placa : " + placa);
        System.out.println("El valor del peaje es : " + valorPeaje);
    }

}
