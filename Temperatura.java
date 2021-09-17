package com.mycompany.clase24;

import javax.swing.*;

public class Temperatura {
    public static void main(String[] args) {
        int cant = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique la cantidad de elementos:", "Cantidad", JOptionPane.QUESTION_MESSAGE));
        double[] temperaturas = new double[cant];
        int min_val = -4, max_val = 40;
        double prom_temp = 0;
        String resultado;

        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = Math.round((Math.random() * (max_val - min_val + 1) + min_val) * 10) / 10.0;
            prom_temp += temperaturas[i];
            if (i == temperaturas.length - 1) System.out.print(temperaturas[i]);
            else System.out.print(temperaturas[i] + " + ");
        }

        prom_temp = Math.round((prom_temp / temperaturas.length) * 10) / 10.0;
        System.out.println("\nPromedio de temperaturas: " + prom_temp);
        if (prom_temp >= 25.6) System.out.println("Calor");
        else System.out.println("Frío");

        if (prom_temp >= 25.6) resultado = "Calor";
        else resultado = "Frío";
        JOptionPane.showMessageDialog(null, resultado, "Clima pormedio", JOptionPane.INFORMATION_MESSAGE);
    }
}
