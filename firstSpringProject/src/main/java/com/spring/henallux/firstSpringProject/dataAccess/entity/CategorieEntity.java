package com.spring.henallux.firstSpringProject.dataAccess.entity;


import javax.persistence.*;

@Entity
@Table(name="categorie")
public class CategorieEntity {

    @Id
    @Column(name = "Id")
    private int id;

    public CategorieEntity() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
