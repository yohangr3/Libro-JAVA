package com.exercise.Automovil;

public class Main {
    public static void main(String[] args) {

        Automovil automovil1 = new Automovil("Mazda",2022,2000, Automovil.tipoCombustible.gasolina,
                Automovil.tipoAutomovil.SUV,4,5,130, Automovil.tipoColor.negro,
                180,true);
        System.out.println(automovil1);
        automovil1.acelerar(20);
        System.out.println(automovil1.velocidadActual);
        automovil1.desacelerar(50);
        System.out.println(automovil1.velocidadActual);
        automovil1.frenar();
        System.out.println(automovil1.velocidadActual);

        System.out.println(automovil1.multas());

         /**
        System.out.println(automovil1.acelerar());
        System.out.println(automovil1.desacelerar());
        System.out.println(automovil1.tiempoEstimado());
        System.out.println(automovil1.frenar());
        System.out.println(automovil1.getColor());
        automovil1.setColor(Automovil.tipoColor.azul);
        System.out.println(automovil1.getColor());**/
    }
}
