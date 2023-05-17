/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskcontrol.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonat
 */
public class Database {
    protected Connection conexion;
    private final String JDBC_DRIVER = "org.postgresql.Driver";
    private final String DB_URL = "jdbc:postgresql://localhost:5432/db_login_proyecto";
    private final String USUARIO = "postgres";
    private final String CONTRASEÑA = "1234";
    
    /**
     *
     * @throws ClassNotFoundException
     */
    public void Conectar() throws ClassNotFoundException{
        try {
            System.out.println("BASE DE DATOS CONECTADA");
            conexion = DriverManager.getConnection(DB_URL, USUARIO, CONTRASEÑA);
            Class.forName(JDBC_DRIVER);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Cerrar() throws SQLException{
        if (conexion != null){
            if (!conexion.isClosed()){
                System.out.println("BASE DE DATOS DESCONECTADA");
                conexion.close();
            }
        }
    }
}
