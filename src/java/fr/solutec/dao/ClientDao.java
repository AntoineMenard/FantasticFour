/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author esic
 */
public class ClientDao {
    public static  Client getByLogAndPass(String log, String mdp)
    throws SQLException{
        Client u = null;
        
        String sql = "select * from person where login=? and password=?";
        
        Connection connexion = AccessDb.getConnexion();
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, log);
        requete.setString(2, mdp);
        
        ResultSet rs = requete.executeQuery();
        
        if(rs.next()){
            u = new Client();
            u.setIdClient(rs.getString("idClient"));
            u.setMdp(rs.getString("mdp"));
        }
        
        
        
        return u;
    }
    
    /*public static void insertPerson(Client u)
    throws SQLException{
        
        String sql = "Insert into person (nom,login,password) values (?,?,?)";
        
        Connection connexion = AccessDb.getConnexion();
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, u.getNom());
        requete.setString(2, u.getLogin());
        requete.setString(3, u.getMdp());
        
        requete.execute();
    }
    
    public static List<Client> getAllPerson()
        throws SQLException{
        
        List<Client> Clients = new ArrayList<>();
        
        String sql = "select * from person";
        
        Connection connexion = AccessDb.getConnexion();
        
        Statement requete = connexion.createStatement();
        
        ResultSet rs = requete.executeQuery(sql);
        
        while(rs.next()){
            Client u = new Client();
            u.setId(rs.getInt("idperson"));
            u.setNom(rs.getString("nom"));
            u.setLogin(rs.getString("login"));
            
            Clients.add(u);
        }       
        return Clients;
    } 
    
     public static void deletePerson(String id)
    throws SQLException{
         //String id2 = request.getParameter("login");
        
        String sql = "Delete from person where idperson = ?";
        
        Connection connexion = AccessDb.getConnexion();
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, id);
        
        requete.execute();
    }*/
}
