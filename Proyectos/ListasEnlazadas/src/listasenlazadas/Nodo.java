/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasenlazadas;

/**
 *
 * @author SERVER_PC
 */
public class Nodo {
    Object valor; 
    Nodo siguiente; 

    public Nodo(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public Object getValor() {
        return valor;
    }


    public Nodo getSiguiente() {
        return siguiente;
    }

    public void enlazarNodo (Nodo n){
        this.siguiente = n; 
    }
}
