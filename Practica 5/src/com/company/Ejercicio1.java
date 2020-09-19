package com.company;

public class Ejercicio1 {

    public static void main(String[] args) {

        /*int[] numeros = new int[3];
        numeros[0] = 5;
        numeros[1] = 2;
        numeros[2] = 7;

        String[] nombres = new String[4];
        nombres[0] = "Alan";
        nombres[1] = "Jose";
        nombres[2] = "Maria";
        nombres[3] = "Pedro";

        *//*for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }*//*

        int[][] matriz = new int[3][2];
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[1][0] = 3;
        matriz[1][1] = 4;
        matriz[2][0] = 5;
        matriz[2][1] = 6;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j< 2; j++) {
                System.out.println(matriz[i][j]);
            }
        }*/

        Ejercicio1_Padre padre = new Ejercicio1_Padre();
        EJercicio1_Hija hija = new EJercicio1_Hija();

        padre.ShowMessage();
        hija.ShowMessage();

    }
}
