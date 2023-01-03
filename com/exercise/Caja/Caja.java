package com.exercise.Caja;

public class Caja {
    double longitudBase;
    double longitudAnchura;
    double longitudAltura;
    String tipoCaja;

    public Caja(double longitudBase, double longitudAnchura, double longitudAltura) {
        this.longitudBase = longitudBase;
        this.longitudAnchura = longitudAnchura;
        this.longitudAltura = longitudAltura;
    }
    public Caja() {
        this.longitudBase = 0;
        this.longitudAnchura = 0;
        this.longitudAltura = 0;
    }
    public Caja(double longitud) {
        this.longitudBase = longitud;
        this.longitudAnchura = longitud;
        this.longitudAltura = longitud;
    }
    public Caja(double longitudBase, double longitudAnchura, double longitudAltura,String tipoCaja) {
        this(longitudBase,longitudAnchura,longitudAltura);
        this.tipoCaja = tipoCaja;
    }



}
