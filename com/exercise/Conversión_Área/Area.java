package com.exercise.Conversión_Área;

public class Area {
    double area;
    final double AREA_A_HECTAREA =100;
    final double AREA_A_KILOMETROS_CUADRADOS = 10000;
    final double AREA_A_ACRE = 40.469;

    public Area(double area) {
        this.area = area;
    }

    public double convertirAHectaria(){
        return area/AREA_A_HECTAREA;
    }
    public double convertirAKilometroCuadrados(){
        return area/AREA_A_KILOMETROS_CUADRADOS;
    }
    public double convertirAAcre(){
        return area/AREA_A_ACRE;
    }

    @Override
    public String toString() {
        return "Area{" +
                "area=" + area +
                ", AREA_A_HECTAREA=" + AREA_A_HECTAREA +
                ", AREA_A_KILOMETROS_CUADRADOS=" + AREA_A_KILOMETROS_CUADRADOS +
                ", AREA_A_ACRE=" + AREA_A_ACRE +
                '}';
    }
}

