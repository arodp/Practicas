package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcion;
        String name;
        String last_name;
        String phone;
        int id;

        Agenda agendaTelefonica = new Agenda();
        Contacto c;

        Menu.menu();
        opcion = scan.entrada().nextInt();

        while(opcion != 6){
            switch (opcion){
                case 1:
                    Menu.agendaDespliegue();
                    agendaTelefonica.listarContacto();
                    break;
                case 2:
                    System.out.println("Busqueda de contactos por:\n1.Nombre\n2.ID");
                    opcion = scan.entrada().nextInt();
                    if(opcion == 1){
                        System.out.println("Introduzca el nombre:");
                        name = scan.entrada().nextLine();
                        agendaTelefonica.buscarPorNombre(name); }
                    if(opcion == 2){
                        System.out.println("Introduzca el ID:");
                        id = scan.entrada().nextInt();
                        agendaTelefonica.buscarPorID(id); }
                    break;
                case 3:
                    opcion = 1;
                    while (opcion == 1) {
                        System.out.println("Para agregar un nuevo contacto introduzca: ");
                        System.out.printf("ID: ");
                        id = scan.entrada().nextInt();
                        System.out.printf("Nombre: ");
                        name = scan.entrada().nextLine();
                        System.out.printf("Apellido: ");
                        last_name = scan.entrada().nextLine();
                        System.out.printf("Telefono: ");
                        phone = scan.entrada().nextLine();


                        c = new Contacto(id, name, last_name, phone);
                        agendaTelefonica.agregarContacto(c);
                        System.out.println("Desea agregar otro contacto?\n1.Si\n2.No");
                        opcion = scan.entrada().nextInt(); }
                    break;
                case 4:
                    System.out.println("Para actualizar el contacto ingrese su ID: ");
                    id = scan.entrada().nextInt();
                    System.out.printf("Ingrese su nuevo nombre: ");
                    name = scan.entrada().nextLine();
                    System.out.printf("Ingrese su apellido: ");
                    last_name = scan.entrada().nextLine();
                    System.out.printf("Ingrese su telefono: ");
                    phone = scan.entrada().nextLine();

                    c = new Contacto(id, name, last_name, phone);
                    agendaTelefonica.actualizarContacto(id, c);
                    break;
                case 5:
                    System.out.println("Para eliminar un contacto ingrese su ID");
                    System.out.printf("ID: ");
                    id = scan.entrada().nextInt();
                    c = new Contacto(id);
                    agendaTelefonica.eliminarContacto(c);
                    break;
                default:
                    System.out.println("Introduzca un numero valido.");
                    Menu.menu();
                    opcion = scan.entrada().nextInt();
                    break;
            }
            Menu.menu();
            opcion = scan.entrada().nextInt();
        }

    }
}
