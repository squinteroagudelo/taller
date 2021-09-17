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
public class Ejercicio12Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] lista = new String[5];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = JOptionPane.showInputDialog(null, "ingrese un nombre");
        }
        int posicion = -1;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].equalsIgnoreCase("estefania")) {
                posicion = i;
                break;
            }
        }
        /*if(posicion==-1){
           System.out.println("Estefania no esta en la lista");
       }else{
           System.out.println("Estefania esta en la posicion " + posicion);
       }*/
        try {
            System.out.println(lista[posicion] + " esta en la posicion " + posicion);
        } catch (Exception e) {
            System.out.println("Estefania no esta en la lista");
        }

    }

}
