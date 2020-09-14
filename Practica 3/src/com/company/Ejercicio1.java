package com.company;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        /*1- Escriba un programa que imprima en pantalla los números enteros que existan entre los
        números cuales quiera que ingrese el usuario como inicio y fin.*/

        int num1 = 1;
        int num2 = 2;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el 1er numero entero: ");
        num1 = input.nextInt();
        System.out.println("Ingrese el 2do numero entero: ");
        num2 = input.nextInt();

        if(num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        }
        else if(num1 > num2) {
            for (int i = num1; i >= num2; i--) {
                System.out.println(i);
            }
        }
    }
}
