package com.exercise.Pedido;

public class Pedido {
    String primerPlato;
    String segundoPlato;
    String bebida;
    String postre;

    public Pedido() {
    }

    public void valorDelPlato(String primerPlato, double costoPrimerPlato, String bebida, double costoDeBebida){
        double total = costoPrimerPlato+costoDeBebida;
        System.out.println("El costo total del primer pedido es :" + total);
    }

    public void valorDelPlato(String primerPlato,double costoPrimerPlato,String segundoPlato
                              ,double costoSegundoPlato,String bebida,double costoDeBebida){

        double total = costoPrimerPlato+costoSegundoPlato+costoDeBebida;
        System.out.println("El costo total del segundo pedido es :" + total);
    }
    public void valorDelPlato(String primerPlato,double costoPrimerPlato,String segundoPlato
            ,double costoSegundoPlato,String bebida,double costoDeBebida,String postre,double costoDePostre){

        double total = costoPrimerPlato+costoSegundoPlato+costoDeBebida+costoDePostre;
        System.out.println("El costo total del tercer pedido es :" + total);
    }
}
