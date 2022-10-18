/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasenlazadas;

public class Listas {
    Nodo puntero; 
    int size; 

    public Listas() {
        puntero = null; 
        size = 0; 
    }
    
    public void insertarNodo(Object obj){
        if (puntero==null) {
            puntero = new Nodo(obj);
        }else {
            Nodo temporal = puntero; 
            Nodo nuevo=new Nodo(obj); 
            nuevo.enlazarNodo(temporal);
            this.puntero = nuevo; 
        }
        size++; 
    }
    public Object obtener (int index){
        int contador= 0; 
        Nodo temporal = puntero; 
        while (contador < index) {
            temporal = temporal.getSiguiente();
            contador++; 
        }
        return temporal.getValor(); 
    }
    public boolean isVoid (){
        return (puntero==null)?true:false;
    }

    public int Size () {
        return this.size; 
    }



}
