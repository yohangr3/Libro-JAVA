package com.exercise.interfacesmultiplesvehiculo;

public abstract class Vehiculo {
    int velocidadActual;
    int velocidadMaxima;

    public Vehiculo(int velocidadActual, int velocidadMaxima) {
        this.velocidadActual = velocidadActual;
        this.velocidadMaxima = velocidadMaxima;
    }

    void imprimir() {
        System.out.println("Velocidad actual = " + velocidadActual);
        System.out.println("Velocidad máxima = " + velocidadMaxima);
    }
    public abstract void acelerar(int velocidad);

    public abstract void frenar(int velocidad);
}
