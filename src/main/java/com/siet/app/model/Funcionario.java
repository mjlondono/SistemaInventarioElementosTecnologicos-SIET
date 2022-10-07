package com.siet.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name = "Funcionario")
public class Funcionario {

    @Id
    private Integer codFuncionario;
    private Integer cedula;
    private String nombres;
    private String apellidos;
    @ManyToOne
    private Area idArea;
    
    public Funcionario() {
    }
    
    public Funcionario(Integer codFuncionario, Integer cedula, String nombres, String apellidos, Area idArea) {
        this.codFuncionario = codFuncionario;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.idArea = idArea;
    }
    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
    }
    public Integer getCedula() {
        return cedula;
    }
    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public Area getIdArea() {
        return idArea;
    }
    public void setIdArea(Area idArea) {
        this.idArea = idArea;
    }   


}