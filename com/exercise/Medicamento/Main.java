package com.exercise.Medicamento;

import com.exercise.Medicamento.Medicamento.Posologia;

public class Main {

    //Posologia posologiaDolex = dolex.new Posologia();

    public static void main(String[] args) {

        Medicamento ibuprofeno = new Medicamento("ibuprofeno", "Bayer", Medicamento.tipoDeAdministracion.oral);


        ibuprofeno.posologia = new Posologia(800,8,"No beber alcohol", Posologia.tipoUsuario.adulto);

        ibuprofeno.imprimir();
        ibuprofeno.imprimir1();


    }

}
