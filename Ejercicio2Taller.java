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
public class Ejercicio2Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        System.out.println("los numeros primos son:");
        for(int i =0; i<numeros.length;i++){
            int divisores=0;
            for(int divisor = 1;divisor<=numeros[i];divisor++){
                if(numeros[i]%divisor ==0){
                    divisores++;
                }
            }
            if(divisores<=2 && numeros[i]!=0){
                System.out.print(numeros[i] + " ");
            }
        }
    }
    
}
