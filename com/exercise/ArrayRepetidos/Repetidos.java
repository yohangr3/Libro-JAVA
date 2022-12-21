package com.exercise.ArrayRepetidos;

public class Repetidos {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 4, 4, 6, 7, 8, 9, 10};
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    System.out.println("Elemento repetido: " + array[i]);
                }
            }
        }

    }

}
