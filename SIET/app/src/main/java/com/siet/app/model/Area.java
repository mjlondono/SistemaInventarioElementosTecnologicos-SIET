package com.siet.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "Area")
public class Area {

    @Id
    private Integer idArea;
    private String nomArea;

    public Area() {
    }

    public Area(Integer idArea, String nomArea) {
        this.idArea = idArea;
        this.nomArea = nomArea;
    }
    
    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public String getNomArea() {
        return nomArea;
    }

    public void setNomArea(String nomArea) {
        this.nomArea = nomArea;
    }
    
    
}
