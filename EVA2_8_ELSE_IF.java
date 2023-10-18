/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_else_if;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class EVA2_8_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes;
        Scanner input = new Scanner(System.in);
      System.out.println("Introduce el nuemro del mes:");
      mes = input.nextInt();
      if((mes >= 0) && (mes <= 12)){//if((mes > 0
          if(mes == 1)
              System.out.println("ENERO");
          if(mes == 2)
              System.out.println("FEBRERO");
          if(mes == 3)
              System.out.println("MARZO");
          if(mes == 4)
              System.out.println("ABRIL");
          if(mes == 5)
              System.out.println("MAYO");
          if(mes == 6)
              System.out.println("JUNIO");
          if(mes == 7)
              System.out.println("JULIO");
          if(mes == 8)
              System.out.println("AGOSTO");
          if(mes == 9)
              System.out.println("SEPTIEMBRE");
          if(mes == 10)
              System.out.println("OCTUBE");
          if(mes == 11)
              System.out.println("NOVIEMBRE");
          if(mes == 12)
              System.out.println("DICIEMBRE");
          else System.out.println("El numero no es valido");
              
          
          
          
      }
    }
    
}
