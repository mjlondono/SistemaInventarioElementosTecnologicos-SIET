package com.siet.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "Usuario")
public class Usuario {

    @Id
    private int id;
    private String usuario;
    private String contrasena;
    @OneToOne
    private Funcionario codFuncionario;

    public Usuario() {

   
    }
    
    public Usuario(int id, String usuario, String contrasena, Funcionario codFuncionario) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.codFuncionario = codFuncionario;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
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
    
    public Funcionario getCodFuncionario() {
        return codFuncionario;
    }
    
    public void setCodFuncionario(Funcionario codFuncionario) {
        this.codFuncionario = codFuncionario;
    }
}
