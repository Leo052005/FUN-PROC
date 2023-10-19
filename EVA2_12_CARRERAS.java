/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_carrera;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class EVA2_CARRERA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String carrera;
        Scanner input = new Scanner (System.in);
      System.out.println("Introduce las siglas de tu carrera (MAYUSCULAS)");  
      carrera = input.nextLine();
      
      switch (carrera){
          case "INC" :
              System.out.println("Ingenieria en sistemas computacionales");
              break;
          case "INF" :
              System.out.println("Ingenieria en informatica");
              break;
          case "IND" :
              System.out.println("Ingenieria industrial");
              break;
          case "IDI" :
              System.out.println("Ingenieria en diseño industrial");
              break;
          case "LA" :
              System.out.println("Lisensiatura en administracion");
              break;
          case "IGE" :
              System.out.println("Ingenieria en gestion empresarial");
              break;
          case "ARQ" :
              System.out.println("Arquitectura");
              break;
              default:
              System.out.println("Siglas no validas");
              
              
      }
      
        
    }
    
}
