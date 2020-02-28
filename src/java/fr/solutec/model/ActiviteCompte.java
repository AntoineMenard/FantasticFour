/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

import java.util.Date;

/**
 *
 * @author esic
 */
public class ActiviteCompte {
    private int idactiviteCompte;
    private double modificationSolde;
    private Date date;
    private int compte_idcompte;

    public ActiviteCompte(int idactiviteCompte, double modificationSolde, Date date, int compte_idcompte) {
        this.idactiviteCompte = idactiviteCompte;
        this.modificationSolde = modificationSolde;
        this.date = date;
        this.compte_idcompte = compte_idcompte;
    }

    public int getIdactiviteCompte() {
        return idactiviteCompte;
    }

    public void setIdactiviteCompte(int idactiviteCompte) {
        this.idactiviteCompte = idactiviteCompte;
    }

    public double getModificationSolde() {
        return modificationSolde;
    }

    public void setModificationSolde(double modificationSolde) {
        this.modificationSolde = modificationSolde;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCompte_idcompte() {
        return compte_idcompte;
    }

    public void setCompte_idcompte(int compte_idcompte) {
        this.compte_idcompte = compte_idcompte;
    }

    public ActiviteCompte() {
    }


    
}
