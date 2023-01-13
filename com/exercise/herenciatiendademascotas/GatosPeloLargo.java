package com.exercise.herenciatiendademascotas;

public class GatosPeloLargo extends Gato {
    enum tipoRaza{
        angora,himalaya,balines,somali
    }
    tipoRaza raza;

    public GatosPeloLargo(String nombre, int edad, String color, double alturaSalto, double longitudSalto, tipoRaza raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }
}
