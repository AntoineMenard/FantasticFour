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
public class Conseiller {
    
    private int idConseiller;
    private String mdp;
    private String nom;
    private String prenom;
    private String mail;
    private int statut;
    private String photo;
    private String login;

    public Conseiller() {
    }

    public Conseiller(int idConseiller, String mdp, String nom, String prenom, String mail, int statut, String photo, String login) {
        this.idConseiller = idConseiller;
        this.mdp = mdp;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.statut = statut;
        this.photo = photo;
        this.login = login;
    }

    public int getIdConseiller() {
        return idConseiller;
    }

    public void setIdConseiller(int idConseiller) {
        this.idConseiller = idConseiller;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getStatut() {
        return statut;
    }

    public void setStatut(int statut) {
        this.statut = statut;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    
    
    
}
