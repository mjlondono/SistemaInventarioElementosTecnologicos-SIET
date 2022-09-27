package com.siet.app.model;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

@Table(name = "Elemento")
public class Elemento {
    
    @Id
    private int placa;
    private String nombre;
    private String modelo;
    private String serial;
    private String area;
    private int estado;
    @ManyToOne
    private Funcionario codFuncionario;

    public Elemento() {
    }

    public Elemento(int placa, String nombre, String modelo, String serial, String area, int estado, Funcionario codFuncionario) {
        this.placa = placa;
        this.nombre = nombre;
        this.modelo = modelo;
        this.serial = serial;
        this.area = area;
        this.estado = estado;
        this.codFuncionario = codFuncionario;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Funcionario getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Funcionario codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

}
