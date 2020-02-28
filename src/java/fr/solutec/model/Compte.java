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
public class Compte {
    private int idcompte;
    private int idclient;
    private double solde;
    private int idCarte;
    private int decouvertpermis;
    private int statutcarte;

    public Compte(int idcompte, int idclient, double solde, int idCarte, int decouvertpermis, int statutcarte) {
        this.idcompte = idcompte;
        this.idclient = idclient;
        this.solde = solde;
        this.idCarte = idCarte;
        this.decouvertpermis = decouvertpermis;
        this.statutcarte = statutcarte;
    }

    public Compte() {
    }

    public int getIdcompte() {
        return idcompte;
    }

    public void setIdcompte(int idcompte) {
        this.idcompte = idcompte;
    }

    public int getIdclient() {
        return idclient;
    }

    public void setIdclient(int idclient) {
        this.idclient = idclient;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public int getIdCarte() {
        return idCarte;
    }

    public void setIdCarte(int idCarte) {
        this.idCarte = idCarte;
    }

    public int getDecouvertpermis() {
        return decouvertpermis;
    }

    public void setDecouvertpermis(int decouvertpermis) {
        this.decouvertpermis = decouvertpermis;
    }

    public int getStatutcarte() {
        return statutcarte;
    }

    public void setStatutcarte(int statutcarte) {
        this.statutcarte = statutcarte;
    }
    



}
