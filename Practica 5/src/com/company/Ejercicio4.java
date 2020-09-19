package com.company;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {

        List<Object> cantidad = new ArrayList<>();
        int numero;

        System.out.println("Ingrese la cantidad de numeros: ");
        numero = new java.util.Scanner(System.in).nextInt();

        System.out.println("\nAhora ingrese los numeros");
        for (int i = 0; i < numero; i++){
            int a = new java.util.Scanner(System.in).nextInt();
            cantidad.add(a);
        }
        System.out.println(cantidad);

    }
}
