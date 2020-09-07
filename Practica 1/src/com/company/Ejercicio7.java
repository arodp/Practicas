package com.company;

public class Ejercicio7 {
    public static void main(String[] args) {
        double base = 3;
        double altura = 8.9;
        double area;

        area = (base * altura) / 2;
        System.out.println("Base = " + base);
        System.out.println("Altura = " + altura);
        System.out.println("Area = " + String.format("%.2f", area));
    }
}
