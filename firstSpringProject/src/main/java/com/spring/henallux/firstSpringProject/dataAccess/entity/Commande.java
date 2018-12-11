package com.spring.henallux.firstSpringProject.dataAccess.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "commande")
public class Commande {
    @Id
    @Column(name = "Id")
    private int id;

    @Column(name = "DateCreation")
    private Date dateCreation;

    @Column(name = "Client_Id")
    private UserEntity user;


}
