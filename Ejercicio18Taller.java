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
public class Ejercicio18Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fila1 = (int) (Math.random() * 3 + 2);// Math.random()*(valorMaximo - valorMinimo) + valorMinimo
        int columna1 = (int) (Math.random() * 3 + 2);// Math.random()*(5 - 2) + 2
        int fila2 = (int) (Math.random() * 3 + 2);//asi entrego valores entre 2 y 5
        int columna2 = (int) (Math.random() * 3 + 2);

        int[][] matriz1 = new int[fila1][columna1];
        int[][] matriz2 = new int[fila2][columna2];
        System.out.println("matriz1");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                matriz1[i][j] = (int) (Math.random() * 9);
                System.out.print(matriz1[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("matriz2");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                matriz2[i][j] = (int) (Math.random() * 9);
                System.out.print(matriz2[i][j] + "  ");
            }
            System.out.println("");
        }

        if (fila1 == fila2 && columna1 == columna2) {
            int[][] resultado = new int[fila2][columna2];
            System.out.println("matriz resultado");
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[0].length; j++) {
                    resultado[i][j] = matriz1[i][j] + matriz2[i][j];
                    System.out.print(resultado[i][j] + "  ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("esas matrices no se pueden sumar");
        }

    }

}
