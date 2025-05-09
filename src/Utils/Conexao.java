/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author kloth
 */

public class Conexao  {

    private static String url = "jdbc:postgresql://localhost:5432/postgres";
    private static String user = "postgres";
    private static String password = "Santana1996@";
    private static Connection con = null;
    
    public static Connection getConexao() throws SQLException{
        con = DriverManager.getConnection(url, user, password);
        return con;
    }  
    
    public static void fecharConexao(){
       if(con != null)
          con = null;
    }
    
}
