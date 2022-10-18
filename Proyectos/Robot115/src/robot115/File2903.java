/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot115;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SERVER_PC
 */
public class File2903 {

    public static void main(String[] args) {
        String ruta = "c:\\prueba\\archivo.txt";
        int valor = 0;
        String texto = "";
        String datosViejos = "";
        Scanner leer = new Scanner(System.in);
        System.out.println("digite lo que a guardar");
        texto = leer.nextLine();

        try {
            FileReader fr1 = new FileReader(ruta);
            while (valor != -1) {
                datosViejos += (char) valor;
                valor = fr1.read();

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(File2903.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(File2903.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileWriter fw1 = new FileWriter(ruta);
            fw1.write(datosViejos+ "\n"+texto + "\n");

            fw1.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
