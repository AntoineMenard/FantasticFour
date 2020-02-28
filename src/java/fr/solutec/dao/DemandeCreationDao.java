/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.DemandeCreation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author esic
 */
public class DemandeCreationDao {
    
public static void InsertDemandeCreation()
        throws SQLException{ 
        
        String sql = "INSERT DEMANDEINSCRIPTION (mail, nom, prenom, adresse, mail) VALUES (?,?,?,?,?)";
        /*Connection connexion = AccessDb.getConnection();
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, d.getNom());
        requete.setString(2, d.getPrenom());
        requete.setString(3, d.getAdresse());
        requete.setString(4, d.getMail());
        requete.setString(5, d.getTel());
        
        
        requete.execute();*/
}
        
    }