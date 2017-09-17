/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opium.apps;

/**
 *
 * @author sunny
 */
import java.sql.*;
import javax.swing.*;

public class javaconnect {
    Connection conn=null;
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:opium.db3");
            //JOptionPane.showMessageDialog(null, "Connected to Opium-Pharmacare System database.");
            return conn;
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
