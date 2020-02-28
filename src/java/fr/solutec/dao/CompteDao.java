/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;

import fr.solutec.model.Compte;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author esic
 */
public class CompteDao {

    public static ArrayList<Compte> getAllComptebyId(int id)
            throws SQLException {
        ArrayList<Compte> comptes = new ArrayList<Compte>();

        String sql = "SELECT * FROM compte where client_idclient= ?";
        Connection connexion = AccessDb.getConnexion();

        PreparedStatement st = connexion.prepareStatement(sql);
        st.setInt(1, id);
        
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            Compte c = new Compte();
            c.setIdcompte(rs.getInt("idcompte"));
            c.setIdclient(rs.getInt("client_idclient"));
            c.setSolde(rs.getDouble("solde"));
            c.setDecouvertpermis(rs.getInt("decouvert"));
            comptes.add(c);
        }

        return comptes;
    }
}
