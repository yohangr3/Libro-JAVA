package com.exercise.herenciatiendademascotas;

public class GatosSinPelo extends Gato {
    enum tipoRazas{
        esfinge,elfo,donskoy
    }
    tipoRazas razas;

    public GatosSinPelo(String nombre, int edad, String color, double alturaSalto, double longitudSalto, tipoRazas razas) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.razas = razas;
    }
}
