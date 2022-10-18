/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo115_1907;

import java.util.Scanner;

/**
 *
 * @author SERVER_PC
 */
public class POO115_1907 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cantidad;
        cantidad= 0;
        Scanner sc;
        sc =  new Scanner (System.in);
        System.out.println("Digite la cantidad de dolares");
        cantidad = sc.nextDouble();
        Moneda m = new Moneda(cantidad);
        m.setCantidad(cantidad);
        System.out.println("Colones: "+ "");
        System.out.println("Euro: "+ "");
        
        
        
    }
    
}
