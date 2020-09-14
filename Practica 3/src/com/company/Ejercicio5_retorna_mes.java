package com.company;
import java.util.Scanner;

public class Ejercicio5_retorna_mes {
    private int numero_mes;
    private String mes;

    public int Entrada(){

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");

        return numero_mes = input.nextInt();
    }

    public String Meses(int numero){

        switch (numero) {
            case 1: mes = "ENERO";
                break;
            case 2: mes = "FEBRERO";
                break;
            case 3: mes = "MARZO";
                break;
            case 4: mes = "ABRIL";
                break;
            case 5: mes = "MAYO";
                break;
            case 6: mes = "JUNIO";
                break;
            case 7: mes = "JULIO";
                break;
            case 8: mes = "AGOSTO";
                break;
            case 9: mes = "SEPTIEMBRE";
                break;
            case 10: mes = "OCTUBRE";
                break;
            case 11: mes = "NOVIEMBRE";
                break;
            case 12: mes = "DICIEMBRE";
                break;
            default: mes = "INVALIDO";
                    break;
        }
        return mes;
    }
}
