/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplorobot;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SERVER_PC
 */
public class fileProgram {

    public static void main(String[] args)  {
      String path = "c:\\prueba\\filexReader.txt";
        try {
            FileWriter fw = new FileWriter(path);
            FileReader fr = new FileReader(path);
            BufferedWriter bw = new BufferedWriter(fw);
            BufferedReader br = new BufferedReader(fr);
            bw.write("hola mundo 1");
            bw.newLine();
            bw.write("Hola mundo 2");
            bw.flush();
            String linea = br.readLine();
            while (linea != null) {                
                System.out.println(linea);
                linea = br.readLine();
            }
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("");
        } catch (IOException ex) {
            System.out.println(""); 
        }
    }
}
