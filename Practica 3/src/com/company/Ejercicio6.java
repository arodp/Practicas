package com.company;

public class Ejercicio6 {
    public static void main(String[] args) {

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("Eliga una opcion: \n" +
                    "1-Convertir grados a Celsius a Fahrenheit\n" +
                    "2-Convertir dólar a pesos\n" +
                    "3-Convertir metros a pies\n" +
                    "4-Salir");

            Ejercicio6_Menu menu = new Ejercicio6_Menu();
            opcion = new java.util.Scanner(System.in).nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad en °C: ");
                    System.out.println(menu.Celsius_Fahrenheit(menu.Entrada()) + " °F");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad en dolares: ");
                    System.out.println(menu.Dolar_Peso(menu.Entrada()) + " $RD");
                    break;
                case 3:
                    System.out.println("Ingreser la cantidad de metros: ");
                    System.out.println(menu.Metros_Pies(menu.Entrada()) + " Pies");
                    break;
                case 4:
                    menu.Cerrar();
            }
            System.out.println("Press Enter To Continue...");
            new java.util.Scanner(System.in).nextLine();
        }
    }
}
