package com.company;
import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = {9,15,1,14,8,7,6,5};

        Arrays.sort(numeros, 0, 8);

        for (int num : numeros){
            System.out.println(num);
        }
    }
}
