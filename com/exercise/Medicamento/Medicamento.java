package com.exercise.Medicamento;

public class Medicamento {
    String nombre;
    String fabricante;

    Posologia posologia;
    enum tipoDeAdministracion{
        oral,tintramuscular,suncutanea,intravenosa
    }
    tipoDeAdministracion administracion;

    public Medicamento(String nombre, String fabricante, tipoDeAdministracion administracion) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.administracion = administracion;
    }
    void imprimir1() {
        System.out.println("Nombre del medicamento = " + nombre);
        System.out.println("Fabricante del medicamento = " + fabricante);
        System.out.println("Vía de administración = " + administracion);
    }

    static class Posologia{

        public enum tipoUsuario{
            niño,adulto,diabetico,adulto_Mayor
        }
        tipoUsuario usuarios;
        public double dosis;
        double periodoTiempo;
        String recomendaciones;
        public Posologia(double dosis, double periodoTiempo, String recomendaciones,tipoUsuario usuarios) {
            this.dosis = dosis;
            this.periodoTiempo = periodoTiempo;
            this.recomendaciones = recomendaciones;
            this.usuarios = usuarios;
        }



    }
    void imprimir() {
        System.out.println("Usuarios = " +this.posologia.usuarios );
        System.out.println("Dosis = " + this.posologia.dosis);
        System.out.println("Periodo = " + this.posologia.periodoTiempo);
        System.out.println("Recomendaciones = " + this.posologia.recomendaciones);
    }
}
