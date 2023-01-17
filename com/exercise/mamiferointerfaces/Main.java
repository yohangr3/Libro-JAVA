package com.exercise.mamiferointerfaces;

public class Main {
    public static void main(String[] args) {
        Ballenas mobyDick = new Ballenas(); // Crea una ballena
        mobyDick.amamantarCrias(); /* Invoca el método heredado de la clase Mamífero */
        Ornitorrinco ornitorrinco1 = new Ornitorrinco(); /* Crea un ornitorrinco */
        ornitorrinco1.amamantarCrias(); /* Invoca el método heredado de la clase Mamífero */
        ornitorrinco1.ponerHuevos(); /* Invoca el método implementado de la interfaz Ornitorrinco */
        Murcielago murcielago1 = new Murcielago();
        murcielago1.volar();
    }
}
