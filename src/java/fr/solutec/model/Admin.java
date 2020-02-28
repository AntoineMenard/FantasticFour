/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

/**
 *
 * @author esic
 */
public class Admin {

    private int idAdmin;
    private String mdp;
    private String nom;
    private String prenom;
    private String login;

    public Admin() {
    }

    public Admin(int idAdmin, String mdp, String nom, String prenom, String login) {
        this.idAdmin = idAdmin;
        this.mdp = mdp;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    
            

    
    

}
