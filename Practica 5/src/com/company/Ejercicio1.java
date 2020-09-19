package com.company;

public class Ejercicio1 {

    public static void main(String[] args) {

        Ejercicio1_Padre padre = new Ejercicio1_Padre();
        EJercicio1_Hija hija = new EJercicio1_Hija();

        padre.ShowMessage();
        hija.ShowMessage();

    }
}
