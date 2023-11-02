/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_16_cajero1;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class EVA2_16_CAJERO1 {

    public static void main(String[] args) {
        int cuenta = 1000;
        int retiro = 0;
        Scanner input = new Scanner (System.in);
        
        while(cuenta > 0){
            System.out.println("¿Cuanto dinero quieres disponer?");
            retiro = input.nextInt();
            cuenta -= retiro;
            System.out.println("Tu saldo es " + cuenta);
                    
        }
        
        
    }
}
