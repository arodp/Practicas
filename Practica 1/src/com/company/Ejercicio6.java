package com.company;

public class Ejercicio6 {
    public static void main(String[] args) {
        double millas = 112.5;
        double km;

        km = millas * 1.60934;
        System.out.println(millas + " = " + String.format("%.2f", km));
    }
}
