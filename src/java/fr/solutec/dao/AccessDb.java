/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccessDb {
    protected static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    protected static final String DB_NAME = "fantasticfour";
    protected static final String URL = "jdbc:mysql://localhost/"+DB_NAME;
    protected static final String USER = "root";
    protected static final String PASSWORD = "";
    
    static{
        try {
            Class.forName(DRIVER_NAME).newInstance();
        } catch (Exception e) {
            System.out.println("Erreur " + e.getMessage());
        }
    }
    
    public static Connection getConnexion()
            throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
