/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.Admin;
import fr.solutec.model.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author esic
 */
public class AdminDao {
    public static  Admin getByLogAndPass(String log, String mdp)
    throws SQLException{
        Admin u = null;
        
        String sql = "select * from admin where Login=? and mdp=?";
        
        Connection connexion = AccessDb.getConnexion();
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, log);
        requete.setString(2, mdp);
        
        ResultSet rs = requete.executeQuery();
        
        if(rs.next()){
            u = new Admin();
            u.setLogin(rs.getString("login"));
            u.setMdp(rs.getString("mdp"));
        }
        
        
        
        return u;
    }
}
