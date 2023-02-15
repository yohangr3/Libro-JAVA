package com.exercise.herenciainterfacesmatchdeportivo;

public class PartidoFutbolLigaEspañola implements PartidoFutbol{
    String  equipoLocal;
    String equipoVisitante;
    int golesEquipoLocal;
    int golesEquipoVisitante;

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getGolesEquipoLocal() {
        return golesEquipoLocal;
    }

    @Override
    public void setGolesEquipoLocal(int golesEquipoLocal) {
        this.golesEquipoLocal = golesEquipoLocal;
    }

    public int getGolesEquipoVisitante() {
        return golesEquipoVisitante;
    }

    @Override
    public void setGolesEquipoVisitante(int golesEquipoVisitante) {
        this.golesEquipoVisitante = golesEquipoVisitante;
    }

    void imprimirMarcador(){
        System.out.println("Goles equipo local : " + golesEquipoLocal + ", golesEquipoVisitante : " + golesEquipoVisitante);
    }


}
