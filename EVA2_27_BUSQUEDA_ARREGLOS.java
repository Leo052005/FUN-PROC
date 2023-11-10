/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_27_busqueda_arreglos;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class EVA2_27_BUSQUEDA_ARREGLOS {

    public static void main(String[] args) {
        //CREAR UN ARREGLO DE 15 ELEMENTOS
        int[] arreglo = new int[15];
        //LLENARLO CON VALORES ALEATORIOS ENTRE 0 Y 99
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int) (Math.random() * 100);
        }
         for (int i = 0; i < arreglo.length; i++) {
             System.out.print("[" + arreglo[i] + "]"); 
        }
         int num;
         Scanner input = new Scanner(System.in);
         System.out.println("¿QUE NUMERO BUSCAS");
         num = input.nextInt();
         //BUSQUEDA SECUENCIAL POR FUERZA
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] == num){   
                System.out.println("VALOR ENCONTRADO EN LA POSICION: " + i);
                break;
        }   
            
        }
        
    }
}