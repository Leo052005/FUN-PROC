/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_28_arreglos_mdim;

/**
 *
 * @author leo
 */
public class EVA_28_ARREGLOS_MDIM {

    public static void main(String[] args) {
        //ARREGLOS DE DOS DIMENCIONES
        int [][] matriz = new int[5][10];
        
        //ASIGNA EL VALOR
        matriz[1][3] = 100;
        System.out.println("valor en [1][3] = " + matriz[1][3]);
        System.out.println("matriz.length = " + matriz.length);
        
        //matriz.length siempre es la primera dimension 
        for (int i = 0; i < matriz.length; i++) {//filas
            for (int j = 0; j < matriz[i].length; j++) {//columnas
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
         for (int i = 0; i < matriz.length; i++) {//filas
            for (int j = 0; j < matriz[i].length; j++) {//columnas
                matriz[i][j] = (int) (Math.random() * 100);
                System.out.println("[" + matriz[i][j] + "]");
    }
             System.out.println("");
}
    }}