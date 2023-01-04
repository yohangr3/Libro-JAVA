package com.exercise.Strings;

public class Cadena {
    public static void main(String[] args) {

        String nombre = "Yohan Daza 12345";
        System.out.println("Longitud del string "+nombre.length());
        System.out.println(nombre.replaceAll(" ",""));
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.concat("12345"));
        System.out.println(nombre.substring(10,15));
        System.out.println(nombre.replace("o","O"));
        System.out.println(nombre.equals("programacion"));
    }


}
