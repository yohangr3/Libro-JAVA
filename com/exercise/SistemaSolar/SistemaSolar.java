package com.exercise.SistemaSolar;

import java.util.Scanner;

public class SistemaSolar {

    String nombre = null;
    int Cantidadsatelites = 0;
    double masa = 0; //Masa en kilogramos
    double volumen = 0; //Kilómetros cúbicos
    int diametro = 0;//Kilómetros
    int distanciaSol = 0;//Millones de kilómetros

    enum tipoPlaneta{
        gaseoso,terrestre,enano;
    }
    tipoPlaneta tipo;
    Boolean observable = false;

    String periodoOrbital;

    String periodoRotacional;



    public SistemaSolar(String nombre, int cantidadsatelites, double masa, double volumen, int diametro, int distanciaSol, tipoPlaneta tipo,Boolean observable) {
        this.nombre = nombre;
        Cantidadsatelites = cantidadsatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.observable = observable;
    }

    public SistemaSolar(String nombre, int cantidadsatelites, double masa, double volumen, int diametro, int distanciaSol, tipoPlaneta tipo, Boolean observable, String periodoOrbital, String periodoRotacional) {
        this.nombre = nombre;
        Cantidadsatelites = cantidadsatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.observable = observable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacional = periodoRotacional;
    }

    @Override
    public String toString() {
        return "SistemaSolar{" +
                "nombre='" + nombre + '\'' +
                ", Cantidadsatelites=" + Cantidadsatelites +
                ", masa=" + masa +
                ", volumen=" + volumen +
                ", diametro=" + diametro +
                ", distanciaSol=" + distanciaSol +
                ", tipo=" + tipo +
                ", observable=" + observable +
                ", periodoOrbital='" + periodoOrbital + '\'' +
                ", periodoRotacional='" + periodoRotacional + '\'' +
                '}';
    }

    public double obtenerMasa(){
        return masa/volumen;
    }

    public boolean planetaExterior() {
        double limite = 149597870;
        if (distanciaSol > limite) {
            return true;
        }else {
            return false;
        }
    }

    public Object periodoOrb(){
        //Periodo Orbital en horas
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un planeta : ");
        String planeta = sc.nextLine();
        switch (planeta){
            case "Mercurio":
                return (0.24);

            case "Venus":
                return (0.61);

            case "Tierra":
                return (1);

            case "Marte":
                return (1.88);

            case "Jupiter":
                return (12);

            case "Saturno":
                return (29);

            case "Urano":
                return (84);

            case "Neptuno":
                return (165);

            case "Pluton":
                return (248);

            default:{
                return ("Opción incorrecta.");
            }
        }
    }

    public Object periodoRot(){
        //Periodo Rotacional en horas
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un planeta : ");
        String planeta = sc.nextLine();
        switch (planeta){
            case "Mercurio":
                return (1405);

            case "Venus":
                return (5832);

            case "Tierra":
                return (24);

            case "Marte":
                return (25);

            case "Jupiter":
                return (9);

            case "Saturno":
                return (10);

            case "Urano":
                return (17);

            case "Neptuno":
                return (16);

            case "Pluton":
                return (6837);

            default:{
                return ("Opción incorrecta.");
            }
        }
    }
}
