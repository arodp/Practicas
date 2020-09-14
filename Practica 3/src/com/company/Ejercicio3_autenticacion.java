package com.company;

public class Ejercicio3_autenticacion {
    private String usuario;
    private String clave;
    private boolean valor;

    public boolean Autenticar(String usuario, String clave){
        this.usuario = usuario;
        this.clave = clave;

        if(this.usuario.equals("admin") && this.clave.equals("1234"))
            valor = true;

        return valor;

    }

}
