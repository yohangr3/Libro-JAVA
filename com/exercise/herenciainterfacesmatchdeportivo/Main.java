package com.exercise.herenciainterfacesmatchdeportivo;

public class Main {
    public static void main(String[] args) {

        PartidoFutbolLigaEspañola partido1 = new PartidoFutbolLigaEspañola();
        System.out.println("Duración del partido " + PartidoFutbolLigaEspañola.duracionPartido);
        partido1.setEquipoLocal("Real Madrid");
        partido1.setEquipoVisitante("Barcelona");
        partido1.setGolesEquipoLocal(3);
        partido1.setGolesEquipoVisitante(3);
        partido1.imprimirMarcador();
    }
}
