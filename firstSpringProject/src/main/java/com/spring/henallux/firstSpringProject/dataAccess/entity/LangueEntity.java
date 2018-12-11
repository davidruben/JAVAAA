package com.spring.henallux.firstSpringProject.dataAccess.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "langue")
public class LangueEntity {

    @Id
    @Column(name = "Id")
    private String id;

    public LangueEntity() {
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
