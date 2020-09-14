package com.company;

import java.util.Scanner;

public class Ejercicio5_Carro {

    private double _cantidadCombustible;

    public Ejercicio5_Carro(double _cantidadCombustible){
        this._cantidadCombustible = _cantidadCombustible;
    }

    public Ejercicio5_Carro(){
    }

    public void Encender(){
        this._cantidadCombustible--;

        if(this._cantidadCombustible >= 1) {
            System.out.println("Su combustible es " + this._cantidadCombustible);
            System.out.println("El carro avanzó :p");
        }
        else {
            System.out.println("Su combustible es " + this._cantidadCombustible);
            System.out.println("El carro no avanzó T.T");
        }
    }

    public double accederCombustible(){
        System.out.println("Combustible: ");
        this._cantidadCombustible = new java.util.Scanner(System.in).nextDouble();

        return this._cantidadCombustible;
    }
}
