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
public class Client {
    
    private int idClient;
    private String mdp;
    private String nom;
    private String prenom;
    private String mail;
    private String adresse;
    private String tel;
    private String photo;
    private int idConseiller;
    private String login;

    public Client() {
    }

    public Client(int idClient, String mdp, String nom, String prenom, String mail, String adresse, String tel, String photo, int idConseiller, String login) {
        this.idClient = idClient;
        this.mdp = mdp;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.adresse = adresse;
        this.tel = tel;
        this.photo = photo;
        this.idConseiller = idConseiller;
        this.login = login;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
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

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getIdConseiller() {
        return idConseiller;
    }

    public void setIdConseiller(int idConseiller) {
        this.idConseiller = idConseiller;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    

            
}
