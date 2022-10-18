/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplorobot;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SERVER_PC
 */
public class Practica2803 {

    public static void main(String[] args) {
    String texto = "";
        try {
            FileWriter fw = new FileWriter("c:\\prueba\\fichero1.txt");
            fw.write("hola mundo ");

            fw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "titulo: error", JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            FileReader fr = new FileReader("c:\\prueba\\fichero1.txt");
            //Leemos el fichero y lo mostramos por pantalla
            int valor = fr.read();

            while (valor != -1) {
                //System.out.print((char) valor);
                texto = texto + (char) (valor) + "";
                valor = fr.read();
            }
//Cerramos el stream
            fr.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex, " hola error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(Practica2803.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(texto);
    }
}
