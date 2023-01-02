package com.exercise.SistemaSolar;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaSolar planata3 = new SistemaSolar("Mercurio",0,121232341,123213987,123232412,160000000, SistemaSolar.tipoPlaneta.gaseoso,true);
        System.out.println(planata3.periodoOrb());
        System.out.println(planata3);
        SistemaSolar planeta4 = new SistemaSolar("Mercurio",0,121232341,123213987,123232412,160000000, SistemaSolar.tipoPlaneta.gaseoso,true,"Tierra","Marte");
        System.out.println(planeta4);
    }



        /**SistemaSolar planeta = new SistemaSolar("Mercurio",0,121232341,123213987,123232412,160000000, SistemaSolar.tipoPlaneta.gaseoso,true);
        System.out.println(planeta);
        System.out.println(planeta.obtenerMasa());
        System.out.println(planeta.toString());
        System.out.println(planeta.planetaExterior());
        System.out.println();
        SistemaSolar planeta2 = new SistemaSolar("Tierra",1,5.9736E24,1.08321E12,12742,150000000, SistemaSolar.tipoPlaneta.terrestre,true);
        System.out.println(planeta2);
        System.out.println(planeta2.obtenerMasa());
        System.out.println(planeta2.toString());
        System.out.println(planeta2.planetaExterior()); **/
    }

