package com.company;

import java.util.Scanner;

public class Ejercicio6_Menu {
    private double grados_f;
    private double grados_c;
    private double dolar;
    private double pesos;
    private double metros;
    private double pies;
    private double num;

    public double Entrada(){

        Scanner input = new Scanner(System.in);

        return num = input.nextDouble();
    }

    public double Celsius_Fahrenheit(double grados_c){
        this.grados_c = grados_c;
        return  (grados_f = (this.grados_c  * 1.8) + 32);
    }

    public double Dolar_Peso(double dolar){
        this.dolar = dolar;

        return pesos = this.dolar * 58.50;
    }

    public double Metros_Pies(double metros){
        this.metros = metros;

        return pies = this.metros * 3.28084;
    }

    public void Cerrar(){
        System.exit(0);
    }
}
