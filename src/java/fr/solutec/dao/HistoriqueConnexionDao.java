/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.Conseiller;
import fr.solutec.model.HistoriqueConnexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author esic
 */
public class HistoriqueConnexionDao {
    
    public static List<HistoriqueConnexion> getAllHistorique()
        throws SQLException{
        
        List<HistoriqueConnexion> historique = new ArrayList<>();
        
        String sql = "select * from historiqueconnexion";
        
        Connection connexion = AccessDb.getConnexion();
        
        Statement requete = connexion.createStatement();
        
        ResultSet rs = requete.executeQuery(sql);
        
        while(rs.next()){
            HistoriqueConnexion hc = new HistoriqueConnexion();
            hc.setIdhistoriqueConnexion(rs.getInt("idhistoriqueConnexion"));
            hc.setNom(rs.getString("nom"));
            hc.setPrenom(rs.getString("nom"));
            hc.setDate(rs.getTimestamp("date"));
            hc.setClient_idclients(rs.getString("client_idclient"));
            
            
            historique.add(hc);
        }       
        return historique;
    }
    
}
