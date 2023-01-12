package com.exercise.herencia;

public class CuentaAhorros extends Cuenta{
    private boolean activa;


    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if(saldo < 10000){
            activa =false;
        }else {
            activa =true;
        }
    }

    public float retirar(float cantidad){
        if(activa)
            super.retirar(cantidad);
        return saldo;
    }

    public float consignar(float cantidad){
        if(activa)
            super.consignar(cantidad);
        return cantidad;
    }
    public void extractoMensual() {
    /* Si la cantidad de retiros es superior a cuatro, se genera una
    comisión mensual */
        if (numeroRetiros > 4) {
            comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.extractoMensual(); // Invoca al método de la clase padre
    /* Si el saldo actualizado de la cuenta es menor a 10000, la
    cuenta no se activa */
        if ( saldo < 10000 )
            activa = false;
    }
    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Comisión mensual = $ " + comisionMensual);
        System.out.println("Número de transacciones = " + (numeroConsignaciones + numeroRetiros));
        System.out.println();
    }

}
