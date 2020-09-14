package com.company;

public class Ejercicio8_deduciones {
        private double sueldo;
        private double sueldo_anual;
        private double isr;
        private double afp = 0.0287;
        private double ars = 0.0304;
        private double n1 = 416220;
        private double n2 = 624329;
        private double n3 = 867123;

        public void ISR(double sueldo){
            this.sueldo = sueldo;
            this.sueldo_anual = this.sueldo * 12;

            if (this.sueldo_anual <= n1){
                System.out.println("Exento");
            }else if( this.sueldo_anual <= n2 ){
                isr = ((this.sueldo_anual - n1) * 0.15) /12 ;
            }else if( this.sueldo_anual <= n3 ){
                isr = ((this.sueldo_anual - n2) * 0.20 + 31216) / 12;
            }else {
                isr = ((this.sueldo_anual - n3) * 0.25 + 79776) /12;
            }
            System.out.println("ISR es " + isr);
        }

        public void AFP(double sueldo){
            this.sueldo = sueldo;

            System.out.println("AFP es " + this.sueldo * afp);
        }

        public void ARS(double sueldo){
            this.sueldo = sueldo;

            System.out.println("ARS es " + this.sueldo * ars);
        }
}
