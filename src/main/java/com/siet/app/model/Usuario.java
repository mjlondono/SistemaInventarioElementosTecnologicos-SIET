package com.siet.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "Usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //@OneToOne
    //private Funcionario codFuncionario;
    private Integer cod_funcionario_cod_funcionario;
    private String usuario;
    private String contrasena;
    
    public Usuario() {
    }
    
    public Usuario(Integer id, Integer codFuncionario, String usuario, String contrasena) {
        this.id = id;
        this.cod_funcionario_cod_funcionario = codFuncionario;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    public Usuario(String usuario2, String contrasena2, Integer codFuncionario2) {

        this.cod_funcionario_cod_funcionario = codFuncionario2;
        this.usuario = usuario2;
        this.contrasena = contrasena2;


    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getCodFuncionario() {
        return cod_funcionario_cod_funcionario;
    }
    public void setCodFuncionario(Integer codFuncionario) {
        this.cod_funcionario_cod_funcionario = codFuncionario;
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
