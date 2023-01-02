package com.exercise.Conversor;

public class ConversorMetros {
    double metros;
    final double METROS_A_CENTIMETROS =100;
    final double METROS_A_MILIMETROS =1000;
    final double METROS_A_PULGADAS =39.3701;
    final double METROS_A_PIES =3.280841666667;
    final double METROS_A_YARDAS =1.09361;

    public ConversorMetros(double metros) {
        this.metros = metros;
    }

    public double metrosACentimetros(){
        return metros*METROS_A_CENTIMETROS;
    }

    public double metrosAMilimetros(){
        return metros*METROS_A_MILIMETROS;
    }

    public double metrosAPulgadas(){
        return metros*METROS_A_PULGADAS;
    }

    public double metrosAYardas(){
        return metros*METROS_A_YARDAS;
    }

    public double metrosAPies(){
        return metros*METROS_A_PIES;
    }
}
