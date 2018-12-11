package com.spring.henallux.firstSpringProject.dataAccess.entity;


import javax.persistence.*;

@Entity
@Table(name = "correspondant")
public class CorrespondantEntity {
    @Id
    @Column(name = "Id")
    private int id;

    @Column(name = "LibelleCategorie")
    private String libelleCategorie;

    //@ManyToOne(optional = false)
    //@JoinColumn(name = "Langue_Id")
    @Column(name = "Lnague_Id")
    private LangueEntity langue;

   // @ManyToOne(optional = false)
    //@JoinColumn(name = "Categorie_Id")
    @Column(name = "Categori_Id")
    private CategorieEntity categorie;


    public CorrespondantEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelleCategorie() {
        return libelleCategorie;
    }

    public void setLibelleCategorie(String libelleCategorie) {
        this.libelleCategorie = libelleCategorie;
    }

    public CategorieEntity getCategorie() {
        return categorie;
    }

    public void setCategorie(CategorieEntity categorie) {
        this.categorie = categorie;
    }

    public LangueEntity getLangue() {
        return langue;
    }

    public void setLangue(LangueEntity langue) {
        this.langue = langue;
    }
}
