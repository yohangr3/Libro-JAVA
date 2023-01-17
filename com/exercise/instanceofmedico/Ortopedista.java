package com.exercise.instanceofmedico;

public class Ortopedista extends Medico{

    enum tipoOrtopedista{
        maxilofacial,pediatrica
    }

    tipoOrtopedista especialidad;



    public tipoOrtopedista getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(tipoOrtopedista especialidad) {
        this.especialidad = especialidad;
    }
}
