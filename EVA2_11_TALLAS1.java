/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_tallas1;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class EVA2_11_TALLAS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int talla;
        Scanner input = new Scanner (System.in);
        talla = input.nextInt();
        
        switch(talla){
            case 29:
                System.out.println("Small");
                break;
            case 42:
                System.out.println("Medium");
                break;
            case 44:
                System.out.println("Large");
                break;
            case 48:
                System.out.println("Xlarge");
                break;
            default:
                System.out.println("Numero de talla inválido");
                
            
        }
    }
    
}
