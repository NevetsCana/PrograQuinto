/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo115_1907;

/**
 *
 * @author SERVER_PC
 */
public class Moneda {
    private double cantidad;
    private double cantDolar;
    private double cantColones; 
    private double cantEuro; 

    public Moneda(double cantidad){
        this.cantidad = cantidad; 
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
