package com.exercise.herenciatiendademascotas;

public class PerrosMedianos extends Perro {

    enum tipoRaza{
        collie,dalmata,bulldog,galgo,sabueso
    }

    tipoRaza raza;

    public PerrosMedianos(String nombre, int edad, String color, double peso, boolean muerde, tipoRaza raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }
}
