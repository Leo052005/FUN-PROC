/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_uso_arreglos;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class EVA2_USO_ARREGLOS {

    public static void main(String[] args) {
        String[] platillos = new String[10];
        platillos[0] = "carne asada";
        platillos[1] = "chicharon prensado";
        platillos[2] = "huevo";
        platillos[3] = "tamales";
        platillos[4] = "tripitas";
        platillos[5] = "chilaquiles";
        platillos[6] = "frijoles";
        platillos[7] = "burritos";
        platillos[8] = "torta de lomo";
        platillos[9] = "Tacos";
        System.out.println("----------MENU----------");
        double[] precio = {80, 100, 98, 101, 200, 400, 180, 10, 23, 55};
        for (int i = 0; i < platillos.length; i++) {
            System.out.println("-" + platillos[i] + ": $" + precio[i]); 
            
        }
        int opc, cant;
        Scanner input = new Scanner(System.in);
        System.out.println("¿QUE QUIERES ORDENAR?");
        opc = input.nextInt();
        System.out.println("¿CUANTAS QUIRES ORDENAR?");
        cant = input.nextInt();
        System.out.println("EL costo de tu pedido es: $" + (cant * precio[opc]));
        
         
    }
}
