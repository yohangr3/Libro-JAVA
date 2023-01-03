package com.exercise.Pedido;

public class Main {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido();
        pedido1.valorDelPlato("Frijoles",20000,"Gaseosa",5000);
        Pedido pedido2 = new Pedido();
        pedido1.valorDelPlato("Frijoles",20000,"Carne",30000,"Gaseosa",5000);
        Pedido pedido3 = new Pedido();
        pedido1.valorDelPlato("Frijoles",20000,"Carne",30000,"Gaseosa",5000,"3 Leches",10000);


    }
}
