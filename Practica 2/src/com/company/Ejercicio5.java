package com.company;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double balance = 18765.43;
        double monto;
        double actualiza_balance;
        int valor;

        System.out.println("*****Bienvenido!*****");
        System.out.println("Que desea realizar? ");
        System.out.println("1. Retiro\n2.Ver Balance");
        Scanner entrada = new Scanner(System.in);
        valor = entrada.nextInt();

        if (valor == 1) {
            System.out.println("Ingrese el monto a retirar: ");
            monto = entrada.nextInt();
            if (monto <= balance) {
                actualiza_balance = balance - monto;
                System.out.println("Monto retirado.");
                System.out.println("Su nuevo balance es " + actualiza_balance);
            } else if (monto > balance) {
                System.out.println("El monto a retirar debe ser menor al balance disponible.");
            }
        }
        else if (valor == 2){
            System.out.println("Su balance es: " + balance);
        }
        else
            System.out.println("Valor invalido.");
    }
}
