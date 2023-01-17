package com.exercise.instanceofmedico;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector listaMédicos = new Vector();
        Medico medico1 = new Medico();
        listaMédicos.add(medico1);
        Ortopedista ortopedista1 = new Ortopedista();
        listaMédicos.add(ortopedista1);
        Pediatra pediatra1 = new Pediatra();
        listaMédicos.add(pediatra1);
        Ortopedista ortopedista2 = new Ortopedista();
        listaMédicos.add(ortopedista2);

        for(int i = 0; i < listaMédicos.size();i++){
            Medico a = (Medico) listaMédicos.elementAt(i);
            if (a instanceof Ortopedista){
                System.out.println("El objeto en el indice "+ i + " es de la clase Ortopedista");
                continue;
            }
            if (a instanceof Pediatra) {
                System.out.println("El objeto en el indice " + i + " es de la clase Pediatra");
                continue;
            }
            if (a instanceof Medico) {
                System.out.println("El objeto en el indice "+i + " es de la clase Médico");
                continue;
            }
        }
    }

}
