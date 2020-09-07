package com.company;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double num1;
        double num2;
        String sr;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Eliga 's' para sumar o 'r' para restar: ");
        sr = entrada.next();

        if (sr.equals("s")  || sr.equals("s")){
            System.out.println("SUMA\n\nIngrese el 1er numero: ");
            num1 = entrada.nextInt();
            System.out.println("Ingrese el 2do numero: ");
            num2 = entrada.nextInt();
            double suma = num1 + num2;
            System.out.println("La suma es igual a " + suma);
        }
        else if (sr.equals("r")  || sr.equals("R")){
            System.out.println("RESTA\n\nIngrese el 1er numero: ");
            num1 = entrada.nextInt();
            System.out.println("Ingrese el 2do numero: ");
            num2 = entrada.nextInt();
            double resta = num1 - num2;
            System.out.println("La resta es igual a " + resta);
        }
        else
            System.out.println("Opcion Invalida");
    }
}
