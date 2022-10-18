/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fraseinvertida;

import java.util.Scanner;

/**
 *
 * @author SERVER_PC
 */
public class FraseInvertida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declara donde va guardada la frase
        String frase;
        //es el arreglo donde estara la frase
        String[] fraseArreglo ;
        // es el scanner par arecibir la frase del usuairo
        Scanner sc = new Scanner(System.in);
        // numRnd es la variable donde se guarda el numero random
        int numRnd;
        System.out.println("Digite la frase");
        // se obtiene el dato del usuario en frase. 
        frase = sc.nextLine();
        // en este contador se lleva la cuenta de palabras utilizadas.
        int contador = 0;
        //con el metodo split se divide la frase y se convierte en un arreglo 
        fraseArreglo = frase.split(" ");
        //esta variable guarda la frase desordenada.
        String fraseFinal = "";
//        este es un ciclo que recorre todo el arreglo fraseArreglo
        for (int i = 0; i < fraseArreglo.length; i++) {
            // numRnd se guarda una variable random de 0 a el tamaño del arreglo
            numRnd = (int) (Math.random() * (fraseArreglo.length));
            
            if (!fraseArreglo[numRnd].equals("")) {
                
                fraseFinal = fraseFinal + " " + fraseArreglo[numRnd];
                
                fraseArreglo[numRnd] = "";
               
                contador++;
            } else {
                if (contador == fraseArreglo.length) {
                    break;
                }
                i--;
            }
        }
        System.out.println(fraseFinal);

    }

}
