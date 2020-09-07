package com.company;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double num1;
        double num2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte el 1er numero: ");
        num1 = entrada.nextInt();
        System.out.println("Inserte el 2do numero: ");
        num2 = entrada.nextInt();

        if (num1 > num2)
            System.out.println(num1 + " es mayor que " + num2);
        else if (num2 > num1)
            System.out.println(num2 + " es mayor que " + num1);
        else
            System.out.println("Son iguales");
    }
}
