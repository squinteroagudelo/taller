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
public class CreacionVrctor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;//variable escalar
        int[] numeros = new int[4];//creacion de un vector ---> dimension numeros[3]
        //numeros[1] = valor
        numeros[0] = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un numero"));
        numeros[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un numero"));
        numeros[2] = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un numero"));
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

}
