/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productosnombre115;

/**
 *
 * @author SERVER_PC
 */
public class ProductosNombre115 {

   
    public static void main(String[] args) {
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        ConexionBD c = new ConexionBD();
        c.GetConexion();
    }
}
