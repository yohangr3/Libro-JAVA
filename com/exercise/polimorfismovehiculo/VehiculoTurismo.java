package com.exercise.polimorfismovehiculo;

public class VehiculoTurismo extends Vehiculo{
    int numeroPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }


    String mostrarDatos() {
        return super.mostrarDatos()
                +"\n" +"El numero de puertas es : " + numeroPuertas;

    }
}
