/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robot115;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SERVER_PC
 */
public class Robot115 {

    /**
     * @param args the command line arguments
     */
   
       public static void main(String[] args)  {
        
        int teclas[]={
            72, KeyEvent.VK_O, KeyEvent.VK_L, 
            KeyEvent.VK_A, KeyEvent.VK_SPACE, KeyEvent.VK_1,
            KeyEvent.VK_1, KeyEvent.VK_MINUS, KeyEvent.VK_1, KeyEvent.VK_DECIMAL
        };
          
       
           try {
               Robot r = new Robot();
          
            for (int i = 0; i < 1000; i++) {
                if (i==0) {
                    r.delay(3000); //espera 3 segundos
                }else {
                    r.delay(1); //espera medio segundo
                }
//                r.keyPress(teclas[i]);
//                r.keyRelease(teclas[i]);
                
                r.mouseMove(i, i);
            }

           } catch (AWTException ex) {
               JOptionPane.showMessageDialog(null, 
                       ex.getMessage(),
                       "titulo errro", 
                       JOptionPane.ERROR_MESSAGE);
           } 
          
       
   

    }
    
}
