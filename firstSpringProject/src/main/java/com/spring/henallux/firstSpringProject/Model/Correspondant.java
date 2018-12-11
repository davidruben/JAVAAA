package com.spring.henallux.firstSpringProject.Model;

import javax.validation.constraints.NotNull;

public class Correspondant {

    private int id;
    private String libelleCategorie;
    private Categorie categorie;
    private Langue langue;

    public Correspondant() {
    }

    public String getLibelleCategorie() {
        return libelleCategorie;
    }

    public void setLibelleCategorie(String libelleCategorie) {
        this.libelleCategorie = libelleCategorie;
    }

    public Categorie getCategorie() {

        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Langue getLangue() {
        return langue;
    }

    public void setLangue(Langue langue) {
        this.langue = langue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
