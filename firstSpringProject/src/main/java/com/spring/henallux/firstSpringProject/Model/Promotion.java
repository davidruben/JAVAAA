package com.spring.henallux.firstSpringProject.Model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class Promotion {

    private int id;
    private Date dateDebut;
    private Date dateFin;
    private int PromoPourcent;

    public Promotion() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getPromoPourcent() {
        return PromoPourcent;
    }

    public void setPromoPourcent(int promoPourcent) {
        PromoPourcent = promoPourcent;
    }
}
