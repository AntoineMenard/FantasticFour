/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.model;

import java.sql.Date;

/**
 *
 * @author esic
 */
public class ActionAdmin {
    
    private int idActionAdmin;
    private String action;
    private Date date;
    private String idAdmin;
    private String idConseiller;

    public ActionAdmin() {
    }

    public ActionAdmin(int idActionAdmin, String action, Date date, String idAdmin, String idConseiller) {
        this.idActionAdmin = idActionAdmin;
        this.action = action;
        this.date = date;
        this.idAdmin = idAdmin;
        this.idConseiller = idConseiller;
    }

    public int getIdActionAdmin() {
        return idActionAdmin;
    }

    public void setIdActionAdmin(int idActionAdmin) {
        this.idActionAdmin = idActionAdmin;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getIdConseiller() {
        return idConseiller;
    }

    public void setIdConseiller(String idConseiller) {
        this.idConseiller = idConseiller;
    }
  
    
}
