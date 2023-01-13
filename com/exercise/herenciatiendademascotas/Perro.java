package com.exercise.herenciatiendademascotas;

public class Perro extends Mascota{
    double peso;
    boolean muerde;

    public Perro(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }

    public static void sonido(){
        System.out.println("Los perros ladran");
    }
}
