package com.company;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int opcion;

        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Ejercicio3_Aritmetica operacion = new Ejercicio3_Aritmetica();


        do {
            System.out.println("Eliga la operacion: \n1.Suma\n2.Resta\n3.Multiplicacion\n4.Division\n5.Salir");
            switch (opcion = new java.util.Scanner(System.in).nextInt()){
                case 1:
                    System.out.println("Ingrese los numeros: ");
                    System.out.println(operacion.Suma(input1.nextDouble(), input2.nextDouble()));
                    break;
                case 2:
                    System.out.println("Ingrese los numeros: ");
                    System.out.println(operacion.Resta(input1.nextDouble(), input2.nextDouble()));
                    break;
                case 3:
                    System.out.println("Ingrese los numeros: ");
                    System.out.println(operacion.Multiplicacion(input1.nextDouble(), input2.nextDouble()));
                    break;
                case 4:
                    System.out.println("Ingrese los numeros: ");
                    System.out.println(operacion.Division(input1.nextDouble(), input2.nextDouble()));
                    break;
                case 5: System.exit(0);
                    break;
                default: System.out.println("Opcion invalida");
                    break;
            }
            System.out.println("Press Enter To Continue...");
            new java.util.Scanner(System.in).nextLine();
        }
        while (opcion != 5);


    }
}
