/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author SERVER_PC
 */
public class Recursividad {


    public static void main(String[] args) {
        int base = 5;
        int exponente = 3;
        System.out.println(potencia(base,exponente));
    }

    private static int potencia(int base, int exponente) {
        if (exponente == 0) { //
            return 1; //
        } 
        if (exponente == 1) { //
            return base; //
        } 
        
        if (exponente < 0) { 
            return potencia(base, exponente + 1) / base;
        } else {  
            return base * potencia(base, exponente - 1);
        }
    }
    
}
