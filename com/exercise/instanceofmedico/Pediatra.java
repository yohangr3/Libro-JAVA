package com.exercise.instanceofmedico;

public class Pediatra extends Medico{
    enum tipoPediatra{
        neurologos,psicologicos
    }

    tipoPediatra especialidad;



    public tipoPediatra getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(tipoPediatra especialidad) {
        this.especialidad = especialidad;
    }
}
