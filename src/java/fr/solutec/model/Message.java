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
public class Message {
    
    private int idMessage;
    private Date date;
    private String message;
    private String idConseiller;
    private String idClient;

    public Message() {
    }

    public Message(int idMessage, Date date, String message, String idConseiller, String idClient) {
        this.idMessage = idMessage;
        this.date = date;
        this.message = message;
        this.idConseiller = idConseiller;
        this.idClient = idClient;
    }

    public int getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getIdConseiller() {
        return idConseiller;
    }

    public void setIdConseiller(String idConseiller) {
        this.idConseiller = idConseiller;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }
    
    
   
}
