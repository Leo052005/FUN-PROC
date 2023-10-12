/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_operadores;

/**
 *
 * @author leo
 */
public class EVA2_5_OPERADORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int var1, var2, resu;
        
        var1 = 100;
        var2 = 200;
        
        //OPERADOR +
        //SUMA
        //CONTATENAR --> UNIR CADENAS DE TEXTO 
        
        resu = var1 + var2;
        System.out.println();//SALTO DE LINEA
        System.out.println("SUMA: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var1 + var2 = " + resu);
        
        //RESTA
        resu = var1 - var2;
        System.out.println();//SALTO DELINEA
        System.out.println("RESTA: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var1 - var2 = " + resu);
        
        //MULTIPLICACION
        resu = var1 * var2;
        System.out.println();//SALTO DE LINEA
        System.out.println("MULTIPLICACION");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("va1 * var2 = " + resu);
        
        //DIVISION
        var1 = 15;
        var2 = 7;
        resu = var1 / var2;
        System.out.println();//SALTO DE LINEA
        System.out.println("DIVISION");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("vae1 / var2 = " + resu);
        
        //DIVISION FLOTANTE
        double resuExacto;
        resuExacto = var1 / var2;
        System.out.println();//SALTO DE LINEA
        System.out.println("DIVICION EXACTA: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var1 / var2 = " + resuExacto);
        
        double var2F = 7;
        System.out.println();//SALTO DE LINEA
        System.out.println("DIVICION EXACTA (¿SERA?: ");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var1 / var2 = " + resuExacto);
        
        int cifra = 7;
        double cifraDOUBLE = 7.0;
        
        int division = 100 / 10; //SE TOMA DIVISION COMO ENTERO
        //double division = 100 / 10.0; // SE TOMA COMO DIVISOR FLOTANTE
        
        //PRECEDENCIA DE OPERADORES
        int a = 5, b = 3, c = 2;
        int resultado = (a * b) + (a - c) * (b - a);// (15)+(3)*(-2)//15 - 6
        System.out.println("RESULTADO PRECEDENCIA: " + resultado);
        
        //POTENCIAS Y REICES:
        double potencia;
        potencia = Math.pow(100, 2);
        System.out.println("POTENCIA = " + potencia);   
        
        // TODO code application logic here
    }
    
}
