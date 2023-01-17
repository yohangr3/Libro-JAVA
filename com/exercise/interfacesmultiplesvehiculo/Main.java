package com.exercise.interfacesmultiplesvehiculo;

public class Main {
    public static void main(String[] args) {
        VehiculoTerrestre camioneta = new VehiculoTerrestre(100, 250);
        System.out.println("Camioneta");
        camioneta.imprimir();
        camioneta.acelerar(50);
        System.out.println("Nueva Velocidad actual= " + camioneta.velocidadActual);
        VehiculoAcuatico motoAcuática = new VehiculoAcuatico(50, 110);
        System.out.println("Moto acuática");
        motoAcuática.imprimir();
        System.out.println("Revoluciones del motor = " + motoAcuática.calcularRevolucionesMotor(1200, 2));
        motoAcuática.recomendarVelocidad(20);
        VehiculoAereo avion1 = new VehiculoAereo(200,1000);
        System.out.println("Avion");
        avion1.aterrizar();
        avion1.soltarTren();
        avion1.despegar();
        avion1.subirTren();
        avion1.encernder();
        avion1.apagar();

    }
}
