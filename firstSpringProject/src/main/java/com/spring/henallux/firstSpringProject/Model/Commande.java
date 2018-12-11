package com.spring.henallux.firstSpringProject.Model;

import java.util.Date;

public class Commande {


    private int id;
    private Date dateCreation;
    private User client;

    public Commande() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

}
