/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_21_continue2;

/**
 *
 * @author leo
 */
public class EVA_21_CONTINUE2 {

    public static void main(String[] args) {
        for (int i = 1; i < 15; i++) {
            //MODULO -----> %
            if((i % 2) != 0)
            continue;
            System.out.println(i + "-");
            
        }
    }
}
