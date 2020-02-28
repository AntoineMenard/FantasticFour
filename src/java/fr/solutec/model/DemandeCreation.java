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
public class DemandeCreation {
    private int iddemandeInscription;
    private String mail;
    private String nom;
    private String prenom;
    private String adresse;
    private String tel;

    public int getIddemandeInscription() {
        return iddemandeInscription;
    }

    public void setIddemandeInscription(int iddemandeInscription) {
        this.iddemandeInscription = iddemandeInscription;
    }

    public DemandeCreation(int iddemandeInscription, String mail, String nom, String prenom, String adresse, String tel) {
        this.iddemandeInscription = iddemandeInscription;
        this.mail = mail;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
    }

    

    public DemandeCreation() {
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    public void creerDemandeCreation(){
        
    }



}
