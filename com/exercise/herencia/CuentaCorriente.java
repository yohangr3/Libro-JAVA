package com.exercise.herencia;

public class CuentaCorriente extends Cuenta{

    float sobregiro=0;

    public CuentaCorriente(float saldo, float tasaAnual, float sobregiro) {
        super(saldo, tasaAnual);
        this.sobregiro = sobregiro;
    }
    public float retirar(float cantidad) {
        float resultado = saldo - cantidad; // Se calcula un saldo temporal
        /* Si el valor a retirar supera el saldo de la cuenta, el valor
        excedente se convierte en sobregiro y el saldo es cero */
        if (resultado < 0) {
            sobregiro = sobregiro - resultado;
            return  saldo = 0;
        } else {
            super.retirar(cantidad); /* Si no hay sobregiro, se realiza un
            retiro normal */
            return saldo;
        }
    }

    public float consignar(float cantidad) {
        float residuo = sobregiro - cantidad;
        // Si existe sobregiro la cantidad consignada se resta al sobregiro
        if (sobregiro > 0) {
            if ( residuo > 0) { /* Si el residuo es mayor que cero, se libera
            el sobregiro */
                sobregiro = 0;
                saldo = residuo;
                return saldo;
            } else { /* Si el residuo es menor que cero, el saldo es cero y
            surge un sobregiro */
                sobregiro = -residuo;
                saldo = 0;
                return saldo;
            }
        } else {
            super.consignar(cantidad); /* Si no hay sobregiro, se realiza
            una consignación normal */
            return saldo;
        }
    }
    public void extractoMensual() {
        super.extractoMensual(); // Invoca al método de la clase padre
    }
    public void imprimir() {
        System.out.println("Saldo = $ " + saldo);
        System.out.println("Cargo mensual = $ " + comisionMensual);
        System.out.println("Número de transacciones = " + (numeroConsignaciones + numeroRetiros));
        System.out.println("Valor de sogregiro = $" + (numeroConsignaciones + numeroRetiros));
        System.out.println();
    }
}
