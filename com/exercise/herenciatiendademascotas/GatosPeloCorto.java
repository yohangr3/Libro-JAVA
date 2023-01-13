package com.exercise.herenciatiendademascotas;

public class GatosPeloCorto extends Gato {
    enum tipoRaza{
        azulruso,britanico,manx,devonrex
    }

    tipoRaza raza;

    public GatosPeloCorto(String nombre, int edad, String color, double alturaSalto, double longitudSalto, tipoRaza raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }
}
