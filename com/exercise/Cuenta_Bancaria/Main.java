package com.exercise.Cuenta_Bancaria;

public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria("Yohan","Daza",123456,
                CuentaBancaria.tipoCuenta.ahorros,100);
        System.out.println(cuenta.consignar(20));
        System.out.println(cuenta.retirar(50));
        System.out.println(cuenta);
    }
}

