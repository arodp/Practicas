package com.company;

public class Ejercicio1_Superclase {
    String marca;
    String modelo;
    int codigo_identificador;
    String sistema_operativo;
    String color;
    int anio;

    public void Encender(){
        System.out.println("Encendio!");
    }

    public void Apagar(){
        System.out.println("Se Apago!");
    }

    public void Reiniciar(){
        System.out.println("Reiniciando");
    }

    public void Cargar(){
        System.out.println("Cargando");
    }
}
