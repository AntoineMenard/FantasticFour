/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.Conseiller;
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
public class ConseillerDao {
    
    public static void insertConseiller(Conseiller c ) throws SQLException {
        
        String sql = "insert into conseiller (mdp, nom, prenom, mail, statut, photo) values (?,?,?,?,?,?) ";
        
        Connection connexion = AccessDb.getConnexion();
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, c.getMdp());
        requete.setString(2, c.getNom());
        requete.setString(3, c.getPrenom());
        requete.setString(4, c.getMail());
        requete.setInt(5, c.getStatut());
        requete.setString(6, c.getPhoto());
        
        requete.execute();
            
    }
    
    public static List<Conseiller> getAllConseiller()
        throws SQLException{
        
        List<Conseiller> conseillers = new ArrayList<>();
        
        String sql = "select * from conseiller";
        
        Connection connexion = AccessDb.getConnexion();
        
        Statement requete = connexion.createStatement();
        
        ResultSet rs = requete.executeQuery(sql);
        
        while(rs.next()){
            Conseiller c = new Conseiller();
            c.setIdConseiller(rs.getInt("idconseiller"));
            c.setMdp(rs.getString("mdp"));
            c.setNom(rs.getString("nom"));
            c.setPrenom(rs.getString("prenom"));
            c.setMail(rs.getString("mail"));
            c.setStatut(rs.getInt("statut"));
            c.setPhoto(rs.getString("photo"));
            c.setLogin(rs.getString("login"));
            
            conseillers.add(c);
        }       
        return conseillers;
    } 
    
    public static void deleteConseiller(String id) throws SQLException {
        
        String sql = "delete from conseiller where idconseiller=?";
        
        Connection connexion = AccessDb.getConnexion();
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, id);
        
        requete.execute();
            
    }
    
}
