package com.siet.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    private Funcionario codFuncionario;
    private String usuario;
    private String contrasena;
    
    public Usuario() {
    }
    
    public Usuario(Integer id, Funcionario codFuncionario, String usuario, String contrasena) {
        this.id = id;
        this.codFuncionario = codFuncionario;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    public Usuario(String usuario2, String contrasena2, Integer codFuncionario2) {
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Funcionario getCodFuncionario() {
        return codFuncionario;
    }
    public void setCodFuncionario(Funcionario codFuncionario) {
        this.codFuncionario = codFuncionario;
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

}
