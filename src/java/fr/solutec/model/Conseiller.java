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
    
    private String idConseiller;
    private String nom;
    private String prenom;
    private String mail;
    private int statut;
    private String photo;

    public Conseiller() {
    }

    public Conseiller(String idConseiller, String nom, String prenom, String mail, int statut, String photo) {
        this.idConseiller = idConseiller;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.statut = statut;
        this.photo = photo;
    }

    public String getIdConseiller() {
        return idConseiller;
    }

    public void setIdConseiller(String idConseiller) {
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
    
    
    
}
