package com.company;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int num = 1;
        int contador = 0;
        int sumatoria = 0;

        while(num != 0){
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese un numero entero: ");
            num = input.nextInt();

            if(num != 0){
            contador++;
            }
            sumatoria = sumatoria + num;
        }

        System.out.println("Se insertaron " + contador + " numeros diferentes de 0");
        System.out.println("La sumatoria de los numeros es " + sumatoria);

    }
}

