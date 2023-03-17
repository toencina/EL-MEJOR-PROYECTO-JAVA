/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.poo.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fcoja
 */

public class ConexionDAO {
    
    private static Connection conn;
    String url = "jdbc:oracle:thin:@localhost:1521/XE";
    String usuario = "USUARIO_1";
    String password = "USUARIO_1";

    public ConexionDAO() throws SQLException {
        DriverManager.registerDriver (new oracle.jdbc.driver.OracleDriver());
        conn = DriverManager.getConnection(url, usuario, password);
    }

    public static Connection getConnection() throws SQLException {
        if (conn == null) {
            new ConexionDAO();
        }
        return conn;
    }
    
    
  
    
}
    

