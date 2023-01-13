package com.exercise.polimorfismovehiculo;

public class VehiculoDeportivo extends Vehiculo{

    int cilindrada;

    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }


    String mostrarDatos() {
        return super.mostrarDatos() +"\n"
                +"La cilindrada del vehiculo es : " + cilindrada;
    }
}
