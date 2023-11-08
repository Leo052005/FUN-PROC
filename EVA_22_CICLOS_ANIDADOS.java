/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_22_ciclos_anidados;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class EVA_22_CICLOS_ANIDADOS {

    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);
        System.out.println("INTRODUCE EL NUMERO");
        numero = input.nextInt();
        for (int i = numero; i <= numero; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.println("");
            
        }
    }
}
