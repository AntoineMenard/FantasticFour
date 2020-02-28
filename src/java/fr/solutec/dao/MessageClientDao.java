/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.dao;
import fr.solutec.model.Message;
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
public class MessageClientDao {
    
        public static ArrayList<Message> getMessagebyId(int id)
            throws SQLException {
        ArrayList<Message> messages = new ArrayList<Message>();

        String sql = "SELECT * FROM message where client_idclient= ? order by date desc";
        Connection connexion = AccessDb.getConnexion();

        PreparedStatement st = connexion.prepareStatement(sql);
        st.setInt(1, id);
        
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            Message m = new Message();
            
            m.setIdMessage(rs.getInt("idmessage"));
            m.setDate(rs.getDate("date"));
            m.setMessage(rs.getString("message"));
            m.setIdConseiller(rs.getString("conseiller_idconseiller"));
            
        }

        return messages;
    }
}
