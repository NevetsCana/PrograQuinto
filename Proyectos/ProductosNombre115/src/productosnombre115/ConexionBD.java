/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productosnombre115;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;

/**
 *
 * @author SERVER_PC
 */
public class ConexionBD {
    public  Connection GetConexion() {
       String dbUrl = "jdbc:sqlserver://192.168.1.59:1433; "
               + "databaseName=BDVotaciones;user=root;"
               + "encrypt=false;password=ctpinvulc";
        try {  
            Connection con = DriverManager.getConnection(dbUrl);
            System.out.println("asdfadsfadsadsf");
            return con;
        } catch (SQLException e) {
            System.out.println("algo salio mal " + e.toString());
            return null;
        }
    } 
}
