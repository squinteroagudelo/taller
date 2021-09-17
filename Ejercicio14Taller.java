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
public class Ejercicio14Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n = (int)(Math.random()*(90)+10);
       int[] vector = new int[n];
       for(int i =0; i<vector.length;i++){
           vector[i]=(int)(Math.random()*(n-1)+1);
       }
       System.out.println("contenido del vector");
       for(int i =0; i<vector.length;i++){
           System.out.print(vector[i] + "  ");
       }
        System.out.println("");
       for(int i = 0; i<vector.length;i++){
           for(int j = i; j<vector.length; j++){
               if(vector[i]>vector[j]){
               int temp = vector[i];
               vector[i]=vector[j];
               vector[j]=temp;
               }
           }
       }
       System.out.println("contenido del vector ordenado");
       for(int i =0; i<vector.length;i++){
           System.out.print(vector[i] + "  ");
       }
       
    }
    
}
