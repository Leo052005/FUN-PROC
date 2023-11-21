/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_29_arreglos_mdim2;

/**
 *
 * @author leo
 */
public class EVA2_29_ARREGLOS_MDIM2 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][];
        matriz[0] = new int [10];
        matriz[0] = new int [5];
        matriz[0] = new int [3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
                
            }
            
        }
        //LEER NUESTRO ARREGLO
         for (int i = 0; i < matriz.length; i++) {//filas
            for (int j = 0; j < matriz[i].length; j++) {//columnas
                matriz[i][j] = (int) (Math.random() * 100);
                System.out.println("[" + matriz[i][j] + "]");
    }
             System.out.println("");
    }
}
}