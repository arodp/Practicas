package com.company;

public class Ejercicio3 {
    public static void main(String[] args) {

        double dolar = 55.30;
        double precio_dolar = 58.46;    //Valor tomado de https://www.bancentral.gov.do/a/d/2538-mercado-cambiario

        System.out.println(dolar + " dolares es igual a " + String.format("%.2f", (dolar * precio_dolar)) + " pesos dominicanos.");
    }
}
