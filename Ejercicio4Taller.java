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
public class Ejercicio4Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero de elementos"));
        int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=(int) (Math.random()*9); //random genera un numero aleatorio entre 0 y 1
        }
        System.out.println("elementos del vector:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
        System.out.println("elementos que son multiplo de su posicion");
        for(int i = 1; i<numeros.length;i++){
            if(numeros[i]%i==0){
                System.out.print(numeros[i]);
            }
        }
    }
    
}
