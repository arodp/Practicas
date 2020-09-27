package com.company;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Contacto> contactos = new ArrayList<Contacto>();

  /*  public Agenda(){

        this.contactos = new ArrayList<Contacto>();
    }
*/
    public void agregarContacto(Contacto c){


                this.contactos.add( c);


    }

    public void add(Contacto c){
        contactos.add(c);
    }

    public void listarContacto(){

        for(Contacto contacts : contactos){
            System.out.println("ID: " + contacts.getId() + " Nombre: " + contacts.getNombre() +
                               " Apellido: " + contacts.getApellido() + " Telefono: " + contacts.getTelefono());
        }
    }

    public void buscarPorNombre(String nombre){
        boolean encontrado = false;

        for (int i = 0; i < contactos.size() && !encontrado; i++){
            if(contactos.get(i).getNombre().trim().equalsIgnoreCase(nombre.trim())){
                System.out.println("Su telefono es " + contactos.get(i).getTelefono());
                encontrado = true;
            }
        }
        if(!encontrado)
            System.out.println("No se ha encontrado el contacto...");
    }

    public void buscarPorID(int id){
        boolean encontrado = false;

        for(int i = 0; i < contactos.size() && !encontrado; i++){
            if(contactos.get(i).getId() == id) {
                System.out.println("Su telefono es " + contactos.get(i).getTelefono());
                encontrado = true;
            }
        }
        if(!encontrado)
            System.out.println("No se ha encontrado el contacto...");
    }

    public void eliminarContacto(Contacto c){
        boolean encontrado = false;

        for(int i = 0; i < contactos.size() && !encontrado; i++){
            if(contactos.get(i).getId() == c.getId()){
                contactos.remove(i);
                encontrado = true;
            }
        }
        if(encontrado)
            System.out.println("Contacto eliminado.");
        else
            System.out.println("No se ha podido eliminar el contacto.");
    }

    public void actualizarContacto(int id, Contacto c){
        boolean encontrado = false;

        for(int i = 0; i < contactos.size() && !encontrado; i++){
            if(contactos.get(i).getId() == id){
                contactos.set(i, c);
                encontrado = true;
            }
        }
        if(encontrado)
            System.out.println("Contacto actualizado.");
        else
            System.out.println("No se actualizo el contacto");
    }
}


