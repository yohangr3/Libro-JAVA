package com.exercise.Cuenta_Bancaria;

public class CuentaBancaria {
    String nombres;
    String apellidos;
    int numeroCuenta;
    enum tipoCuenta {
        ahorros,corriente
    }
    tipoCuenta cuenta;
    double saldoCuenta=0;

    double interes = 0.05;

    public CuentaBancaria(String nombres, String apellidos, int numeroCuenta, tipoCuenta cuenta, double saldoCuenta) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroCuenta = numeroCuenta;
        this.cuenta = cuenta;
        this.saldoCuenta = saldoCuenta;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", numeroCuenta=" + numeroCuenta +
                ", cuenta=" + cuenta +
                ", saldoCuenta=" + saldoCuenta +
                '}';
    }

    double consultarSaldo(int numeroCuenta ){
        return saldoCuenta;
    }

    double consignar (double valor){
        if(valor <= 0){
            System.out.println("El valor de la consignación debe ser mayor a 0");
        }else{
            saldoCuenta = saldoCuenta+valor;

        }

        return saldoCuenta;
    }

    double retirar(double valorRetiro){
        if((valorRetiro > saldoCuenta)|| (valorRetiro <=0)){
            System.out.println("No es posible retirar, la suma que desea retirar es mayor al saldo de su cuenta o el valor de retiro es 0 o negativa ");
        }else {
            saldoCuenta = saldoCuenta-valorRetiro;
        }
        return saldoCuenta;
    }

    double tasaInteresGanda(){
        return (interes*saldoCuenta) + saldoCuenta;
    }
}
