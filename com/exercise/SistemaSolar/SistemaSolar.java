package com.exercise.SistemaSolar;

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

    @Override
    public String toString() {
        return "SistemaSolar{" +
                "nombre='" + nombre + '\'' +
                ", Cantidadsatelites=" + Cantidadsatelites +
                ", masa=" + masa +
                ", volumen=" + volumen +
                ", diametro=" + diametro +
                ", distanciaSol=" + distanciaSol +
                ", observable=" + observable +
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
}
