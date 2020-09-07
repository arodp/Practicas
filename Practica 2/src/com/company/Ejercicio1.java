package com.company;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        int numero;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        numero = entrada.nextInt();

        if (numero % 2 == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");
    }
}