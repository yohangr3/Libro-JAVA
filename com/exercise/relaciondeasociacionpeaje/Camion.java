package com.exercise.relaciondeasociacionpeaje;

public class Camion extends Vehiculo{

    static int valorPeaje =5000;
    int numeroEjes;

    public Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    public static int getValorPeaje() {
        return valorPeaje;
    }

    public static void setValorPeaje(int valorPeaje) {
        Camion.valorPeaje = valorPeaje;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    void imprimir(){
        System.out.println("Placa : " + placa);
        System.out.println("Numero de ejes : " + numeroEjes);
        System.out.println("El valor del peaje es : " + valorPeaje);
    }
}
