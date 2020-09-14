package com.company;

public class Ejercicio2_Estudiante {
    private double promedio;

    public void muestraPromedio(double promedio){
        this.promedio = promedio;

        if(this.promedio > 100)
            System.out.println("El valor del promedio no puede ser mayor a 100");
        else
            System.out.println("Su promedio es " + this.promedio);
    }
}
