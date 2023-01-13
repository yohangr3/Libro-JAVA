package com.exercise.polimorfismovehiculo;

public class Main {
    public static void main(String[] args) {

        Vehiculo vehiculo1 = new VehiculoDeportivo("bmb-130","Renault","symbol", 4000);
        VehiculoDeportivo vehiculo2 = new VehiculoDeportivo("cvx-123","Mazda","CX-30",2000);
        VehiculoTurismo vehiculo3 = new VehiculoTurismo("cvb-124","Mazda","Familiar",6);
        VehiculoFurgoneta vehiculo4 = new VehiculoFurgoneta("sda-125","GMC","Carguero",1);
        Vehiculo vehiculo5 = new VehiculoTurismo("123-xcv","Mercedez","Splinter",4);
        Vehiculo vehiculos[] = new Vehiculo[4];
        vehiculos[0] = new VehiculoDeportivo("wer-123","Ferrari","No se",3000);
        vehiculos[1] = new VehiculoDeportivo("yui-123","Audi","R8",2000);
        vehiculos[2] = new VehiculoFurgoneta("wer-458","Ford","Raptor",2);
        vehiculos[3] = new VehiculoDeportivo("dsf-456","Hyundai","Veloster",3000);
        Vehiculo vehiculo7 = new VehiculoDeportivo("jah-457","Audi","r3",5000);


        System.out.println(vehiculo1.mostrarDatos());
        System.out.println("-----------------------------");
        System.out.println(vehiculo2.mostrarDatos());
        System.out.println("-----------------------------");
        System.out.println(vehiculo3.mostrarDatos());
        System.out.println("-----------------------------");
        System.out.println(vehiculo4.mostrarDatos());
        System.out.println("-----------------------------");

        for(Vehiculo vehiculo : vehiculos){
            System.out.println(vehiculo.mostrarDatos());
            System.out.println("-----------------------------");
        }
    }
}
