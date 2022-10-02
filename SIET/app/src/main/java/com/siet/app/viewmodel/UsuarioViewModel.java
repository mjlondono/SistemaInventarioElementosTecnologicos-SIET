package com.siet.app.viewmodel;

import java.util.*;

public class UsuarioViewModel {

    private Integer id;    
    public  String usuario;
    private String contrasena;
    private Integer codFuncionario;

    public List<String> mensajes = new ArrayList<>();

    public UsuarioViewModel() {
    }

    public UsuarioViewModel(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    
    public UsuarioViewModel(Integer id, String usuario, String contrasena, Integer codFuncionario) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.codFuncionario = codFuncionario;
    }  

    public UsuarioViewModel(String usuario, String contrasena, Integer codFuncionario) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.codFuncionario = codFuncionario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        this.codFuncionario = codFuncionario;
    }


}
