package com.siet.app.viewmodel;

import java.util.*;

import com.siet.app.model.Elemento;

public class ElementoViewModel {

    private Integer placa;    
    public  String nombre;
    public  String marca;
    public  String modelo;
    public  String serial;
    private Integer codFuncionario;
    private Integer idArea;
    private Integer idEstado;

    public List<String> mensajes = new ArrayList<>();

    public List<String> mensajesb = new ArrayList<>();

    public List<Elemento> searchResults = new ArrayList<>();

    public ElementoViewModel() {
    }

    public ElementoViewModel(Integer placa, String nombre, String marca, String modelo, String serial,
            Integer codFuncionario, Integer idArea, Integer idEstado) {
        this.placa = placa;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.serial = serial;
        this.codFuncionario = codFuncionario;
        this.idArea = idArea;
        this.idEstado = idEstado;
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

    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public Integer getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Integer idEstado) {
        this.idEstado = idEstado;
    }
    
}
