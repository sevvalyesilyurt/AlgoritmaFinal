/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.*;
/**
 *
 * @author Aleyna
 */
public class db {

    Connection conn = null;

    public static Connection connection_db() {

        try {
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\sevva\\OneDrive\\Belgeler\\NetBeansProjects\\HastaTakipSistemi\\db.sqlite");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null ;
        }
    }
}
