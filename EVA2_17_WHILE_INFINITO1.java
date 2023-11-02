/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_17_while_infinito1;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class EVA2_17_WHILE_INFINITO1 {

    public static void main(String[] args) {
        int valor = 100;
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Introduce el numero que piensasas que es correcto");
            int num = input.nextInt();
            if(num == valor)
              System.out.println("Adivinaste");
            break;//Aqui se termina el while
            
        }
        
    }
}
