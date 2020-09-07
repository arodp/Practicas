package com.company;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        double prestamo;
        double interes_anual;
        double cant_cuotas;
        double pagos_mensuales;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el monto del prestamo: ");
        prestamo = entrada.nextDouble();
        System.out.println("Ingrese la cantidad de cuotas: ");
        cant_cuotas = entrada.nextInt();
        System.out.println("Ingrese el % de interes anual: ");
        interes_anual = entrada.nextDouble();

        pagos_mensuales = prestamo * ( ((interes_anual/12)/100) / (1 - Math.pow((1 + ((interes_anual/12)/100)), -cant_cuotas)));
        System.out.println("Su pago mensual sera de: " + String.format("%.2f", pagos_mensuales));
    }
}
