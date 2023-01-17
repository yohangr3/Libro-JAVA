package com.exercise.interfacesmultiplesvehiculo;

public class VehiculoAcuatico extends Vehiculo implements Motor,Vela{

    public VehiculoAcuatico(int velocidadActual, int velocidadMaxima) {
        super(velocidadActual, velocidadMaxima);
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
    public int calcularRevolucionesMotor(int fuerza, int radio) {
        return 0;
    }

    enum usoVehiculo{
        superficie ,submarino
    }

    usoVehiculo tipoDeVehiculo;

    @Override
    public void recomendarVelocidad(int velocidadViento) {
        if(velocidadViento > 80){
            System.out.println("velocidad muy alta ,se recomienda no salir a navegar ");
            velocidadActual=0;
        }else if(velocidadViento<10){
            System.out.println("velocidad muy baja ,se recomienda no salir a navegar ");
        }
    }
}
