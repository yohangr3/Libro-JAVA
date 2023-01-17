package com.exercise.interfacesmultiplesvehiculo;

public class VehiculoTerrestre extends Vehiculo implements Motor{
    int cantidadLlantas;

    public VehiculoTerrestre(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
    }

    @Override
    public void acelerar(int velocidad) {
        velocidadActual = velocidadActual+velocidad;
        if(velocidadActual > velocidadMaxima){
            System.out.println("No se debe superar la velocidad máxima");
        }else {
            velocidadActual = velocidadActual;
        }
    }

    @Override
    public void frenar(int velocidad) {
        if(velocidadActual > 0) {
            velocidadActual = velocidadActual - velocidad;
        } else if (velocidad > velocidadActual) {
            velocidadActual=0;
        }
    }

    enum usoVehiculo{
        militar,civil;
    }

    usoVehiculo tipoVehiculo;

    @Override
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return fuerza*radio;
    }
}
