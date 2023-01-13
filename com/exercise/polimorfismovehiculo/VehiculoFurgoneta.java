package com.exercise.polimorfismovehiculo;

public class VehiculoFurgoneta extends Vehiculo{

    int carga;

    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    @Override
    String mostrarDatos() {
        return super.mostrarDatos() + "\n"
                +"LA capacidad de carga del vehiculo es : " + carga;
    }
}
