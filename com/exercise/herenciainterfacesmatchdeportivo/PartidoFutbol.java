package com.exercise.herenciainterfacesmatchdeportivo;

public interface PartidoFutbol extends MatchDeportivo {

    static final int duracionPartido = 90;

    void setGolesEquipoLocal(int marcador);
    void setGolesEquipoVisitante(int marcador);;
}
