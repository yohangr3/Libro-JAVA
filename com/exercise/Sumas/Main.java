package com.exercise.Sumas;

public class Main {
    public static void main(String[] args) {
        Sumas suma1 = new Sumas();
        Sumas suma2 = new Sumas();
        Sumas suma3 = new Sumas();
        Sumas suma4 = new Sumas();
        System.out.println(suma1.suma(5,5));
        System.out.println(suma2.suma(5,10,10));
        System.out.println(suma3.suma(5.5,5.4));
        System.out.println(suma4.suma(5.5,5.4,5.6));
    }
}
