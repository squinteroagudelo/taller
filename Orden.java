package com.mycompany.clase24;

public class Orden {
    public static void main(String [] args){
        int [] numeros = {5, 21, 6, 45, 1, 2, 4};
        int [] orden = new int[numeros.length];
        int [] pares;
        int [] impares;
        int par = 0, impar = 0, i_par = 0, i_impar = 0, i_orden = 0;

        System.out.println("Arreglo original:");
        for (int numero : numeros) {
            if (numero%2 == 0) ++par;
            else ++impar;
            System.out.print(numero + "\t");
        }

        pares = new int[par];
        impares = new int[impar];
        for (int numero : numeros) {
            if (numero%2 == 0){
                pares[i_par] = numero;
                i_par++;
            } else {
                impares[i_impar] = numero;
                i_impar++;
            }
        }

        for (int i = 0; i < pares.length - 1; i++) {
            if (pares[i] > pares[i+1]){
                int aux = pares[i];
                pares[i] = pares[i+1];
                pares[i+1] = aux;
            }
        }
        System.out.println("\nPares:");
        for (int pare : pares) System.out.print(pare + "\t");

        for (int i = 0 ; i < impares.length - 1 ; i++) {
            int max = i;
            for (int j = i + 1 ; j < impares.length ; j++) {
                if (impares[j] > impares[max]) max = j;
            }

            if (i != max) {
                int aux = impares[i];
                impares[i] = impares[max];
                impares[max] = aux;
            }
        }
        System.out.println("\nImpares:");
        for (int impare : impares) System.out.print(impare + "\t");

        for (int numero : pares) {
            orden[i_orden] = numero;
            i_orden++;
        }

        for (int numero : impares) {
            orden[i_orden] = numero;
            i_orden++;
        }

        numeros = orden;
        System.out.println("\nArreglo ordenado según criterios:");
        for (int i : numeros) {
            System.out.print(i + "\t");
        }
    }
}
