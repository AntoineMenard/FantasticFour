/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.Client;
import fr.solutec.model.Conseiller;
import fr.solutec.model.DemandeCreation;
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
        
        String sql = "select * from client where Login=? and mdp=?";
        
        Connection connexion = AccessDb.getConnexion();
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, log);
        requete.setString(2, mdp);
        
        ResultSet rs = requete.executeQuery();
        
        if(rs.next()){
            u = new Client();
            u.setIdClient(rs.getInt("idclient"));
            u.setLogin(rs.getString("login"));
            u.setMdp(rs.getString("mdp"));
            u.setNom(rs.getString("nom"));
            u.setPrenom(rs.getString("prenom"));
            u.setPhoto(rs.getString("photo"));
            u.setAdresse(rs.getString("adresse"));
            u.setIdConseiller(rs.getInt("conseiller_idconseiller"));
            u.setMail(rs.getString("mail"));
            u.setTel(rs.getString("tel"));
        }
        
        
        
        return u;
    }
    
    public static void insertClient(Client u)
    throws SQLException{

        String sql = "Insert into client (idclient,mdp,nom,prenom,mail,adresse,tel,photo,conseiller_idconseiller,login) values (?,?,?,?,?,?,?,?,?,?)";
        
        Connection connexion = AccessDb.getConnexion();
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setInt(1, u.getIdClient());
        requete.setString(2, u.getMdp());
        requete.setString(3, u.getNom());
        requete.setString(4, u.getPrenom());
        requete.setString(5, u.getMail());
        requete.setString(6, u.getAdresse());
        requete.setString(7, u.getTel());
        requete.setString(8, u.getPhoto());
        requete.setInt(9, u.getIdConseiller());
        requete.setString(10, u.getLogin());
        
        requete.execute();
    }
    
        public static List<DemandeCreation> getAllInscription()
        throws SQLException{
        
        List<DemandeCreation> inscriptions = new ArrayList<>();
        
        String sql = "select * from demandeinscription";
        
        Connection connexion = AccessDb.getConnexion();
        
        Statement requete = connexion.createStatement();
        
        ResultSet rs = requete.executeQuery(sql);
        
        while(rs.next()){
            DemandeCreation c = new DemandeCreation();
            c.setMail(rs.getString("mail"));
            c.setNom(rs.getString("nom"));
            c.setPrenom(rs.getString("prenom"));
            c.setAdresse(rs.getString("adresse"));
            c.setTel(rs.getString("tel"));
            
            inscriptions.add(c);
        }       
        return inscriptions;
    } 
    
     /*public static void deletePerson(String id)
    throws SQLException{
         //String id2 = request.getParameter("login");
        
        String sql = "Delete from person where idperson = ?";
        
        Connection connexion = AccessDb.getConnexion();
        
        PreparedStatement requete = connexion.prepareStatement(sql);
        requete.setString(1, id);
        
        requete.execute();
    }*/
}
