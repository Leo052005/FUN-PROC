/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_and_or_operadores;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class EVA2_6_AND_OR_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int califa;
     Scanner input = new Scanner(System.in);
     
     System.out.println("Introduce la calificacion");
     califa = input.nextInt();
     
     //VALIDAR
     //UNA CALIFA ES MAYOR O IGUAL 0 --> califa <-0
     //Y
     //LA CALIFA ES MENOR O IGUAL A 100 ->califa <-100
     
     if((califa >= 0) && (califa <= 100)){//valor valido
         System.out.println("La calificacion " + califa + "es valida!!");
         if(califa >= 70)
             System.out.println("APROBADO");
    }else{
         System.out.println("La calificacion " + califa + "No es valida");
         
     }
     
    
     
     
     
    }
    
}
