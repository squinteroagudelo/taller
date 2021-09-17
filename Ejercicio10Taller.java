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
public class Ejercicio10Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[10];
        System.out.println("vector original");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
        System.out.println("vector invertido");
        for (int i = (vector.length - 1); i >= 0; i--) {
            System.out.print(vector[i] + " ");
        }

    }

}
