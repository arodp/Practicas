package com.company;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        String user;
        String pwd;
        int contador =0;

        Ejercicio3_autenticacion autenticar = new Ejercicio3_autenticacion();

        do {
            System.out.println("Ingrese el usuario: ");
            user = new java.util.Scanner(System.in).nextLine();

            System.out.println("Ingrese la clave: ");
            pwd = new java.util.Scanner(System.in).nextLine();

            System.out.println(autenticar.Autenticar(user, pwd));
            contador++;

            System.out.println("Press Enter To Continue...");
            new java.util.Scanner(System.in).nextLine();
        }
        while (!(autenticar.Autenticar(user, pwd)) && contador < 3 );

    }
}
