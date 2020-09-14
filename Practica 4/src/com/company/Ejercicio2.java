package com.company;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        double valor;

        Ejercicio2_Estudiante avg = new Ejercicio2_Estudiante();
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el promedio: ");
        valor = input.nextDouble();
        avg.muestraPromedio(valor);
    }
}
