package com.company;
import java.util.Scanner;

public class Ejercicio4_duplicador {
    double num;

    public double Entrada(){

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");

        return num = input.nextDouble();
    }

    public double Duplicar(double numero){
        return numero * 2;
    }
}
