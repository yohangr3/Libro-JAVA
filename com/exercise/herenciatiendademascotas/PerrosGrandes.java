package com.exercise.herenciatiendademascotas;

public class PerrosGrandes extends Perro {

    enum tipoRaza{
        pastoraleman,doberman,rotweiller
    }
     tipoRaza raza;
    public PerrosGrandes(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color, peso, muerde);
    }
}
