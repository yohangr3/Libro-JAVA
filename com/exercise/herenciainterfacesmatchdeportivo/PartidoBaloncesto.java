package com.exercise.herenciainterfacesmatchdeportivo;

public interface PartidoBaloncesto extends MatchDeportivo {
    static final int duracionPartido = 40;

    void setCestasEquipoLocal(int marcador);
    void setCestasEquipoVisitante(int marcador);
}
