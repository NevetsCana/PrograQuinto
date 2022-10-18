/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplorobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SERVER_PC
 */
public class RobotHolaMundo {
    public static void main(String[] args) {
       
//        arreglo de teclas preparadas que usaran el teclado.
        int teclas[]={
            KeyEvent.VK_H,KeyEvent.VK_O, 
            KeyEvent.VK_L,KeyEvent.VK_A, 
            KeyEvent.VK_SPACE,KeyEvent.VK_1,
            KeyEvent.VK_2,KeyEvent.VK_MINUS,
            KeyEvent.VK_4,KeyEvent.VK_DECIMAL
        };
       
        try {
           
           
            Robot r = new Robot();
            
            for (int i = 0; i < teclas.length; i++) {
                if (i==0) {
                r.delay(3000);
                }else {
                    r.delay(50);
                }
                r.keyPress(teclas[i]); 
                r.keyRelease(teclas[i]);
            }
        } catch (AWTException ex) {
            Logger.getLogger(RobotHolaMundo.class.getName()).log(Level.SEVERE, null, ex);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
