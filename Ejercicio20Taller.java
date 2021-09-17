/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.clase24;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Ejercicio20Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] matriz = new double[24][6];
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                matriz[fila][columna] = Math.random() * 2 + 3;
            }
        }
        String contenido="";
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(((double) (Math.round(matriz[fila][columna] * 100)) / 100) + "  ");
                contenido += ((double) (Math.round(matriz[fila][columna] * 100)) / 100) + "  ";
            }
            System.out.println("");
            contenido+="\n";
        }
        JOptionPane.showMessageDialog(null,contenido);
        for (int fila = 0; fila < matriz.length; fila++) {
            double promedio = 0;
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                promedio += matriz[fila][columna];
            }
            promedio /= matriz[fila].length;
            System.out.println("el promedio del estudiante " + fila + " es " + ((double) Math.round(promedio * 100)) / 100);
        }

        for (int columna = 0; columna < 6; columna++) {
            int conteo = 0;
            double promedio = 0;
            for (int fila = 0; fila < 24; fila++) {
                if (matriz[fila][columna] > 2.95) {
                    conteo++;
                }
                 promedio += matriz[fila][columna];
            }
            promedio /= matriz.length;
            System.out.println("la materia " + columna + " la ganaron " + conteo + " estudiantes");
            System.out.println("la materia " + columna + " la perdieron " + (24-conteo) + " estudiantes");
            System.out.println("el promedio de la materia " + columna + " es " + ((double) Math.round(promedio * 100)) / 100);
        }
    }

}
