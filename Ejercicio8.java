/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clase24;

/**
 *
 * @author Andres
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n = (int) (Math.random() * (90) + 10);
        int[] vector1 = new int[n];
        int i = 0;
        while (i < vector1.length) {
            int nuevo = (int) (Math.random() * (90));
            if (!estaEnVector(nuevo, vector1)) {
                vector1[i] = nuevo;
                i++;
            }
        }

        int m = (int) (Math.random() * (90) + 10);
        int[] vector2 = new int[m];
        i = 0;
        while (i < vector2.length) {
            int nuevo = (int) (Math.random() * (90));
            if (!estaEnVector(nuevo, vector2)) {
                vector2[i] = nuevo;
                i++;
            }
        }
        System.out.println("contenido del vector1");
        for (i = 0; i < vector1.length; i++) {
            System.out.print(vector1[i] + "  ");
        }
        System.out.println("");
        System.out.println("contenido del vector2");
        for (i = 0; i < vector2.length; i++) {
            System.out.print(vector2[i] + "  ");
        }

        int conteoDeRepetidos = 0;
        for (i = 0; i < vector1.length; i++) {
            for (int j = 0; j < vector2.length; j++) {
                if (vector1[i] == vector2[j]) {
                    conteoDeRepetidos++;
                }
            }
        }
        if (conteoDeRepetidos == 0) {
            System.out.println("no hay repetidos");
        } else {
            int[] vector3 = new int[conteoDeRepetidos];
            int posicionVector3 = 0;
            for (i = 0; i < vector1.length; i++) {
                for (int j = 0; j < vector2.length; j++) {
                    if (vector1[i] == vector2[j]) {
                        vector3[posicionVector3] = vector1[i];
                        posicionVector3++;
                    }
                }
            }
            System.out.println("");
            System.out.println("contenido del vector3");
            for (i = 0; i < vector3.length; i++) {
                System.out.print(vector3[i] + "  ");
            }
            for (i = 0; i < vector3.length; i++) {
                for (int j = i; j < vector3.length; j++) {
                    if (vector3[i] > vector3[j]) {
                        int temp = vector3[i];
                        vector3[i] = vector3[j];
                        vector3[j] = temp;
                    }
                }
            }
            System.out.println("");
            System.out.println("contenido del vector3 ordenado");
            for (i = 0; i < vector3.length; i++) {
                System.out.print(vector3[i] + "  ");
            }

        }
    }

    public static boolean estaEnVector(int n, int[] vector) {
        boolean indicador = false;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == n) {
                indicador = true;
                break;
            }
        }
        return indicador;
    }

}
