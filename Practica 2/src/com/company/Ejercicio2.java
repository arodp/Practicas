package com.company;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int edad;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte la edad: ");
        edad = entrada.nextInt();

        if (edad >= 0 && edad<=10)
            System.out.println("Es un niño");
        else if (edad >= 11 && edad<=17)
            System.out.println("Es un adolescente");
        else if (edad >= 18 && edad<=38)
            System.out.println("Es un adulto joven");
        else if (edad >= 39 && edad<=59)
            System.out.println("Es adulto de mediana edad");
        else if (edad >= 60 && edad<=99)
            System.out.println("Es un adulto mayor");
    }
}
