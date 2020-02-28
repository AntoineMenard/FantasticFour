/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.Conseiller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
    
}
