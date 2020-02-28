/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author esic
 */
public class HistoriqueConnexion {
    private int idhistoriqueConnexion;
    private String nom;
    private String prenom;
    private Timestamp date;
    private String client_idclients;

    public HistoriqueConnexion(int idhistoriqueConnexion, String nom, String prenom, Timestamp date, String client_idclients) {
        this.idhistoriqueConnexion = idhistoriqueConnexion;
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.client_idclients = client_idclients;
    }

    public HistoriqueConnexion() {
    }

    
    public int getIdhistoriqueConnexion() {
        return idhistoriqueConnexion;
    }

    public void setIdhistoriqueConnexion(int idhistoriqueConnexion) {
        this.idhistoriqueConnexion = idhistoriqueConnexion;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getClient_idclients() {
        return client_idclients;
    }

    public void setClient_idclients(String client_idclients) {
        this.client_idclients = client_idclients;
    }
    
    
}
