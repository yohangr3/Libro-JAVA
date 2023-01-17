package com.exercise.interfacesmultiplesvehiculo;

public class VehiculoAereo extends Vehiculo implements Alas,Reactor{

    public VehiculoAereo(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
    }

    public void despegar(){
        System.out.println("EL avión despegará");
    }

    public void aterrizar(){
        System.out.println("El avión aterrizará");
    }

    public void volar(){
        System.out.println("El avión está volando");
    }

    @Override
    public void soltarTren() {
        System.out.println("Tren de aterrizaje abajo ");
    }

    @Override
    public void subirTren() {
        System.out.println("Subiendo tren de aterrizaje");
    }

    @Override
    public void acelerar(int velocidad) {
        velocidadActual = velocidadActual+velocidad;
    }

    @Override
    public void frenar(int velocidad) {
        if(velocidadActual > 0) {
            velocidadActual = velocidadActual - velocidad;
        } else if (velocidad > velocidadActual) {
            velocidadActual=0;
        }
    }

    @Override
    public void encernder() {
        System.out.println("Motor Encendido");
    }

    @Override
    public void apagar() {
        System.out.println("Motor apagado");
    }
}
