package com.exercise.herenciatiendademascotas;

public class PerrosPequeños {
    enum tipoRaza{
        cariche,yorkshire,terrier,schanauzer,chiuahua
    }

    tipoRaza raza;

    public PerrosPequeños(tipoRaza raza) {
        this.raza = raza;
    }
}
