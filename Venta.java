package com.mycompany.clase24;

public class Venta {
    public static void main(String [] args){
        double[][] mes = new double[4][7];
        int min_val = 1000, max_val = 20000, elementos = 0, semana;
        double promedio_mes = 0, venta_semana = 0;

        for (int i  = 0; i  < mes.length; i ++) {
            for (int j = 0; j < mes[i].length; j++) {
                mes[i][j] = Math.round((Math.random()*(max_val - min_val + 1) + min_val) * 10) / 10.0;
                promedio_mes += mes[i][j];
                elementos++;
//                System.out.print(mes[i][j] + "\t\t");
            }
//            System.out.println("\n");
        }

        promedio_mes = Math.round((promedio_mes / elementos) * 100.0) / 100.0;
        System.out.println("Promedio de ventas del mes: " + promedio_mes);
        if (promedio_mes > 10000) semana = 1;
        else semana = mes.length;

        System.out.println("\nVentas de la semana " + semana);
        for (double venta:mes[semana - 1]) {
            System.out.println(venta);
            venta_semana += venta;
        }
        System.out.println("\nTotal ventas de la semana " + semana + ": " + (Math.round(venta_semana * 100.0) / 100.0));
    }
}