package com.siet.app.model;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.ManyToOne;

@Entity

@Table(name = "Elemento")
public class Elemento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer placa;
    private String nombre;
    public  String marca;
    private String modelo;
    private String serial;
    //@ManyToOne
    //private Area idArea;
    private Integer idArea;
    //@ManyToOne
    //private Funcionario codFuncionario;
    private Integer codFuncionario;
    //@ManyToOne
    //private Estado idEstado;
    private Integer idEstado;
    
    public Elemento() {
    }

    public Elemento(/*Integer placa,*/ String nombre, String marca, String modelo, String serial, Integer idArea, Integer codFuncionario, Integer idEstado) {
        //this.placa = placa;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.serial = serial;
        this.idArea = idArea;
        this.codFuncionario = codFuncionario;
        this.idEstado = idEstado;
    }

    public Elemento(Integer placa2, String nombre2, String marca2, String modelo2, String serial2, Integer idArea2,Integer codFuncionario2, Integer idEstado2) {

        this.placa = placa2;
        this.nombre = nombre2;
        this.marca = marca2;
        this.modelo = modelo2;
        this.serial = serial2;
        this.idArea = idArea2;
        this.codFuncionario = codFuncionario2;
        this.idEstado = idEstado2;
    }

    public Integer getPlaca() {
        return placa;
    }

    public void setPlaca(Integer placa) {
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }
    
}
