package com.exercise.herenciatiendademascotas;

public class Main {
    public static void main(String[] args) {

        Perro perro1 = new Perro("Kira",6,"cafe",3,false);
        Perro.sonido();
        GatosSinPelo gatos1 = new GatosSinPelo("Homero",3,"cafe",1,2, GatosSinPelo.tipoRazas.esfinge);
        Gato.sonido();
    }
}
