/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_20_continue1;

/**
 *
 * @author leo
 */
public class EVA2_20_CONTINUE1 {

    public static void main(String[] args) {
        //BREAK ---> termina la interacion actual
        for (int i = 1; i < 15; i++) {
            if(i == 10)
                break;
            
            System.out.println(i + "-");
            
        }
        System.out.println("");
        for (int i = 1; i < 15; i++) {
            if(i == 10)
                continue;
            
            System.out.println(i + "-");
            
        }
    }
}
