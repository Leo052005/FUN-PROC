/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_califas_eua1;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class EVA2_10_CALIFAS_EUA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int califa;
        Scanner input = new Scanner(System.in);
        califa = input.nextInt();
        
        if((califa > 89) && (califa < 101))
            System.out.println("A");
        else if ((califa > 79) && (califa < 91))
            System.out.println("B");
        else if ((califa > 69) && (califa < 81))
            System.out.println("C");
        else if ((califa > 59) && (califa <71))
            System.out.println("D");
        else if ((califa >= 0) && (califa < 61))
            System.out.println("F");
        
        
        
    }
    
}
