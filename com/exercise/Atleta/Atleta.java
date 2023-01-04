package com.exercise.Atleta;

public class Atleta {
    int identificador;
    String nombreAtleta;
    double tiempoPrueba;

    static int contador=0;
    static String seleccion ="Colombia";
    static double tiempoEquipo;

    public Atleta(String nombreAtleta,double tiempoPrueba){
        contador++;
        identificador=contador;
        this.nombreAtleta=nombreAtleta;
        this.tiempoPrueba=tiempoPrueba;
    }

    public double correr(){
        tiempoEquipo = tiempoEquipo+tiempoPrueba;
        return tiempoEquipo;
    }



    public void imprimir() {
        System.out.println("Identificador del atleta = " + identificador);
        System.out.println("Nombre del atleta = " + nombreAtleta);
        System.out.println("Tiempo del atleta = " + tiempoPrueba + "segundos");
        System.out.println();
    }
    public static void imprimirSeleccion(){
        System.out.println("Seleccion : " + seleccion);
    }
    public static void imprimirTiempoEquipo() {
        System.out.println("Tiempo del equipop = " + tiempoEquipo + "segundos");
    }

}
