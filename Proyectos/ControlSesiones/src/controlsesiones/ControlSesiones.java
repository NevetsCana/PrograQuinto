package controlsesiones;
//Descripcion:

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SERVER_PC
 */
//Descripcion: 
public class ControlSesiones {
//Descripcion: 

    static Scanner leer = new Scanner(System.in);
//Descripcion: 
    static boolean islogged = false;
//Descripcion: 
    static String loggedUser;
    static String saldo;
    
    public static void main(String[] args) {
        int opcion = 0;//Descripcion: 

        while (opcion != 3) {//Descripcion: 
            if (islogged) {//Descripcion: 
                menuUsuario();
                System.out.println("Digite una opcion");
                opcion = leer.nextInt();
                Switch(opcion);//Descripcion: 
                if (opcion >= 3) {//Descripcion: 
                    islogged = false;
                    System.out.println("cerrando sesion");
                    loading(400);
                    opcion = 0;
                }
            } else {//Descripcion: 
                imprimirMenu();//Descripcion: 
                System.out.println("Digite una opcion");
                opcion = leer.nextInt();
                Switch(opcion);
            }
        }
    }

    private static void menuUsuario() {
        System.out.println("Usuario esta loggeado");
        System.out.println("1-Cambiar contraseña");
        System.out.println("2-Ver Cuenta Bancaria");
        System.out.println("3-Eliminar usuario");
        System.out.println("5-Hacer Deposito");
        System.out.println("4-Cerrar Session");
    }

    private static void imprimirMenu() {
        System.out.println("1-Registrar usuario");
        System.out.println("2-Iniciar sesion");
        System.out.println("3-Salir");
    }

    private static void Switch(int opcion) {
        switch (opcion) {
            case 1:
                if (islogged) {
                    CambiarContraseña();
                } else {
                    RegistrarUsuario();//Descripcion: 
                }
                break;
            case 2:
                if (islogged) {
                    VerCuentaBancaria();
                } else {
                    IniciarSesion();//Descripcion:
                }
                break;
            case 3:
                if (islogged) {
                    EliminarUsuario();//Descripcion: 
                } else {
                    System.out.println("Terminando");
                    loading(400);
                }
                break;
            case 4:
                if (islogged) {
                    islogged = false;
                }
                break;
            case 5:
                if (islogged) {
                    depositar();
                }
        }
    }

    private static void RegistrarUsuario() {
        String nombre, usuario, correo, password;
        System.out.println("Digite su nombre");
        nombre = leer.next();
        System.out.println("Digite su usuario");
        usuario = leer.next();
        System.out.println("Digite su correo");
        correo = leer.next();
        System.out.println("Digite su password");
        password = leer.next();
        toRegist(nombre, usuario, correo, password);//Descripcion: 
    }

    private static void IniciarSesion() {
        String usuario, contra;//Descripcion: 
        String ruta;//Descripcion: 
        String[] InfoArray;//Descripcion:
        System.out.println("digite su usuario ");
        usuario = leer.next();
        ruta = "c:\\sesiones\\" + usuario + ".txt";
        FileReader fr;//Descripcion: 
        System.out.println("digite su contraseña");
        contra = leer.next();
        File file = new File("c:\\sesiones\\" + usuario + ".txt");//Descripcion: 
        if (file.exists()) {//Descripcion: 
            try {
                fr = new FileReader(ruta);
                BufferedReader br = new BufferedReader(fr);//Descripcion: 
                InfoArray = br.readLine().split("/");//Descripcion: 
                br.close();
                if (usuario.equals(InfoArray[1]) && contra.equals(InfoArray[3])) {//Descripcion: 
                    islogged = true;
                    loggedUser = usuario;
                    saldo = InfoArray[4];
                    loading(400);//Descripcion: 
                   
                } else {
                    islogged = false;//Descripcion: 
                }
            } catch (FileNotFoundException ex) {
            } catch (IOException ex) {
            }
        } else {
            System.out.println("Contraseña o usuario incorrectos");
            loading(400); //Descripcion: 
        }
    }

    private static void EliminarUsuario() {
        String respuesta; 
        String ruta = "c:\\Sesiones\\"+loggedUser+".txt"; 
        ;
        if (islogged) {
            System.out.println("Desea eliminar su cuenta? \n Si o No");
            respuesta = leer.next();
            if (respuesta.toLowerCase().equals("si")) {
                File file = new File(ruta);
                if (file.delete()) {
                    System.out.println("la Cuenta ha sido eliminada");
                }
            }
        }
        loading(300);
    }

    private static void CambiarContraseña() {
        String nuevaContra;
        System.out.println(loggedUser + " digita contraseña actual");
        String contra = leer.next();
        String[] infcontra;

        try {
            String ruta = "c:\\sesiones\\" + loggedUser + ".txt";
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
            infcontra = br.readLine().split("/");
            if (contra.equals(infcontra[3])) {
                FileWriter fw = new FileWriter(ruta);
                System.out.println("digita la nueva contraseña");
                infcontra[3] = leer.next();
                fw.write(infcontra[0] + "/" + infcontra[1] + "/" + infcontra[2] + "/" + infcontra[3]);
                fw.close();
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
        System.out.println("Cambiando Contraseña");
        loading(400);
    }

    private static void toRegist(String nombre, String usuario, String correo, String password) {
        String ruta = "c:\\sesiones\\" + usuario + ".txt";
        int timeCounter = 0;
        File f = new File(ruta);
        if (f.exists()) {
            System.out.println("ya existe este usuario");
            loading(400);
        } else {
            try {
                FileWriter fw = new FileWriter(ruta);
                fw.write(nombre + "/" + usuario + "/" + correo + "/" + password);
                fw.close();
            } catch (IOException ex) {

            }
        }
    }

    private static void loading(int millis) {
        int timeCounter = 0;
        while (timeCounter < 10) {
            try {
                timeCounter += 1;
                if (timeCounter == 10) {
                    System.out.println("▓");
                } else {
                    System.out.print("▓");
                }
                Thread.sleep(millis);
            } catch (InterruptedException ex) {

            }
        }
    }

    private static void VerCuentaBancaria() {
        System.out.println("estoy en cuenta bancaria");
        loading(400);
    }

    private static void depositar() {

    }

}
