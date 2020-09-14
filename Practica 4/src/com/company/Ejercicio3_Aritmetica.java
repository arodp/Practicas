package com.company;

import java.util.Scanner;


public class Ejercicio3_Aritmetica {
    private double num1;
    private double num2;

    public double Suma(double a, double b){
        this.num1 = a;
        this.num2 = b;

        return this.num1 + this.num2;
    }

    public double Resta(double a, double b){
        this.num1 = a;
        this.num2 = b;

        return this.num1 - this.num2;
    }

    public double Multiplicacion(double a, double b){
        this.num1 = a;
        this.num2 = b;

        return this.num1 * this.num2;
    }

    public double Division(double a, double b){
        this.num1 = a;
        this.num2 = b;

        return this.num1 / this.num2;
    }
}
