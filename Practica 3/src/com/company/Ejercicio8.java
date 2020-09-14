package com.company;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        double valor;

        Scanner salario = new Scanner(System.in);
        Ejercicio8_deduciones deduciones = new Ejercicio8_deduciones();

        System.out.println("Ingrese el salario: ");
        valor = salario.nextDouble();

        deduciones.ISR(valor);
        deduciones.AFP(valor);
        deduciones.ARS(valor);

    }
}
