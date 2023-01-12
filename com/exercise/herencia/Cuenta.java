package com.exercise.herencia;

public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones=0;

    protected int numeroRetiros=0;
    protected float tasaAnual;

    protected float comisionMensual =0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public float consignar(float consignacion){
        saldo = saldo + consignacion;
        return saldo;
    }

    public float retirar(float retiro){
        if (retiro > saldo){
            return 0;
        }else {
            saldo = saldo-retiro;
            return saldo;
        }

    }

    //Asumiendo que el interes es del 10% mensual
    public void calcularInteres(){
        float tasaMensual = tasaAnual/12;
        float interesMensual = saldo * tasaMensual;
        saldo+=interesMensual;
    }

    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteres();
    }


}
