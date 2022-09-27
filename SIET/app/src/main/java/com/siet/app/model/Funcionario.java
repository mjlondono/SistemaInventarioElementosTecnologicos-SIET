package com.siet.app.model;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

@Table(name = "Funcionario")
public class Funcionario {

    @Id
    private int codFuncionario;
    private int cedula;
    private String nombres;
    private String apellidos;
    private int idArea;

    public Funcionario(){

    }

    public Funcionario(int codFuncionario, int cedula, String nombres, String apellidos, int idArea) {
        this.codFuncionario = codFuncionario;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.idArea = idArea;
    }

    public int getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
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

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

}