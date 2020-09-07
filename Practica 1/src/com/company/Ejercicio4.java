package com.company;

public class Ejercicio4 {
    public static void main(String[] args) {
        double gradosF = 90;
        double gradosC;

        gradosC = (gradosF - 32) / 1.8;

        System.out.println(gradosF + "°F = " + String.format("%.2f", gradosC) + "°C");
    }
}
