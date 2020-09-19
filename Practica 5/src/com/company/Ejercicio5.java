package com.company;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] A = {2,4,6};
        int[] B = {1,3,5};
        int[] prodcuto_vec = new int[A.length];



        for (int i = 0; i < A.length; i++){
            prodcuto_vec[0] = (A[1] * B[2]) - (A[2] * B[1]);
            prodcuto_vec[1] = -((A[0] * B[2]) - (A[2] * B[0]));
            prodcuto_vec[2] = (A[0] * B[1]) - (A[1] * B[0]);

            System.out.println(prodcuto_vec[i]);
        }



        /*int[][] A_B = new int[2][3];
        A_B[0][0] = 2;
        A_B[0][1] = 4;
        A_B[0][2] = 6;
        A_B[1][0] = 1;
        A_B[1][1] = 3;
        A_B[1][2] = 5;*/
    }
}
