package com.exercise.herenciatiendademascotas;

public class Gato extends Mascota {
    double alturaSalto;
    double longitudSalto;

    public Gato(String nombre, int edad, String color, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color);
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }

    public static void sonido(){
        System.out.println("Los gatos maúllan y ronronean");
    }
}
