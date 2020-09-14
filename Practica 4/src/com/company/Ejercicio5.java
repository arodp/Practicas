package com.company;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int a = 1;

        Ejercicio5_Carro car1 = new Ejercicio5_Carro();
        Ejercicio5_Carro car2 = new Ejercicio5_Carro(car1.accederCombustible());


        while(a == 1){
            car2.Encender();
            System.out.println("Ingrese '1' para continuar o ingrese '0' para salir");
            a = new java.util.Scanner(System.in).nextInt();
        }

    }
}
