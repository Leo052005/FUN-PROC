/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_leap_year;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class EVA2_7_LEAP_YEAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year, resi4, resi100, resi400;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el año");
        year = input.nextInt();
        
        resi4 = year % 4;//residuo de dividir el año entre 4
        resi100 = year % 4;//residuo de dividir el año entre 100
        resi400 = year % 4;//residuo de dividir el año entre 400
        
        if((resi4 == 0) && ((resi100 != 0) ll (resi400 == 0))) 
                System.out.println("El año " + "es bisiesto");
        else
            System.out.println("El año es " + year + " no es bisiesto");
            
        
            
    }
    
}
