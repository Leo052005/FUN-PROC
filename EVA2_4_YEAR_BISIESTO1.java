/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_year_bisiesto1;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class EVA2_4_YEAR_BISIESTO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int año, residuo;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el año");
        año = input.nextInt();
        residuo = año%4;
        
        if(residuo == 0){ //divisible entre 4, no es garantia de año bisiesto
            residuo = año % 100;
            if(residuo > 0)//no es divisible entre 100 es bisiesto
                System.out.println("Es año bisiesto");
            else{
                residuo = año % 400;
                if(residuo == 0)
                    System.out.println("Es año es bisiesto");
                else
                    System.out.println("No esbisiesto");
                
            }
        }else
            System.out.println("No es año bisiesto");
            
        }
        
    }
    
