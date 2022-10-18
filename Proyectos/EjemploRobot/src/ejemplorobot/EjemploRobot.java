package ejemplorobot;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Robot;
import java.awt.event.*;
 
public class EjemploRobot extends JFrame {
 
    private JPanel contentPane;
 
    //Atributos especificos para el ejemplo
    private JLabel etiquetas[];
    private int indice=0;
 
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    EjemploRobot frame = new EjemploRobot();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    /**
     * Create the frame.
     */
    public EjemploRobot() {
 
        //Parametros asociados a la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);
 
        //Permitimos que podamos ejecutar el evento de keylistener
        contentPane.setFocusable(true);
 
        //Componentes
 
        JLabel lblPulsaEnterPara = new JLabel("Pulsa enter para rellenar las etiquetas");
        lblPulsaEnterPara.setBounds(126, 24, 230, 14);
        contentPane.add(lblPulsaEnterPara);
 
        //Creamos un array que almacena JLabel
        etiquetas=new JLabel[6];
 
        etiquetas[0] = new JLabel("1");
        etiquetas[0].setHorizontalAlignment(SwingConstants.CENTER);
        etiquetas[0].setBounds(47, 111, 54, 14);
        contentPane.add(etiquetas[0]);
 
        etiquetas[1] = new JLabel("2");
        etiquetas[1].setHorizontalAlignment(SwingConstants.CENTER);
        etiquetas[1].setBounds(169, 111, 46, 14);
        contentPane.add(etiquetas[1]);
 
        etiquetas[2] = new JLabel("3");
        etiquetas[2].setHorizontalAlignment(SwingConstants.CENTER);
        etiquetas[2].setBounds(298, 111, 46, 14);
        contentPane.add(etiquetas[2]);
 
        etiquetas[3] = new JLabel("4");
        etiquetas[3].setHorizontalAlignment(SwingConstants.CENTER);
        etiquetas[3].setBounds(47, 193, 54, 14);
        contentPane.add(etiquetas[3]);
 
        etiquetas[4] = new JLabel("5");
        etiquetas[4].setHorizontalAlignment(SwingConstants.CENTER);
        etiquetas[4].setBounds(169, 193, 46, 14);
        contentPane.add(etiquetas[4]);
 
        etiquetas[5] = new JLabel("6");
        etiquetas[5].setHorizontalAlignment(SwingConstants.CENTER);
        etiquetas[5].setBounds(298, 193, 46, 14);
        contentPane.add(etiquetas[5]);
 
        //Eventos
 
        contentPane.addKeyListener(new KeyListener(){
            public void keyTyped(KeyEvent e){
 
            }
            public void keyPressed(KeyEvent e){
 
                //Solo entrara si pulsamos enter o si no hay etiquetas en el array
                if(e.getKeyCode()==KeyEvent.VK_ENTER && indice<etiquetas.length){
 
                    //Colorea el fondo de la etiqueta de rojo
                    etiquetas[indice].setBackground(new Color(255, 0, 0));
                    etiquetas[indice].setOpaque(true);
                    indice++;
 
                    try {
                        //Espera un segundo
                        Thread.sleep(1000);
 
                        //creamos un robot y le indicamo que presione un enter
                        Robot robot=new Robot();
                        robot.keyPress(KeyEvent.VK_ENTER);
                    } catch (AWTException e1) { //Excepcion de robot
                        e1.printStackTrace();
                    } catch (InterruptedException e1) { //Excepcion de thread
                        e1.printStackTrace();
                    }
                }
            }
            public void keyReleased(KeyEvent e){
 
            }
        });
 
    }
 
}
