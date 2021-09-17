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
public class Ejercicio6Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] matriz = new String[4][4];
        String[] vector1 = new String[8];
        String[] vector2 = new String[8];
        for (int i = 1; i <= 8; i++) {
            vector1[i - 1] = Integer.toString(i);
        }
        vector2[0] = "A";
        vector2[1] = "B";
        vector2[2] = "C";
        vector2[3] = "D";
        vector2[4] = "E";
        vector2[5] = "F";
        vector2[6] = "G";
        vector2[7] = "H";

        int a = 0;
        int b = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j+=2) {
                /*if (j % 2 == 0) {
                    matriz[i][j] = vector2[a];
                    a++;
                } else {
                    matriz[i][j] = vector1[b];
                    b++;
                }*/
                   matriz[i][j] = vector2[a];
                    a++;
                
                    matriz[i][j+1] = vector1[b];
                    b++;
            }
        }
        for(int i =0;i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        

    }

}
