/*package com.siet.app.model;

import javax.persistence.*;

@Entity
@Table
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 20, unique = true, name = "usuario")
    private String usuario;
    @Column(nullable = false, length = 20, unique = false, name = "contrasena")
    private String contrasena;

    @OneToOne
    @JoinColumn(name = "codFuncionario", referencedColumnName = "id", nullable = false, unique = false)
    private Funcionario codFuncionario;
    
    public Usuario() {
    }

    public Usuario(String usuario, String contrasena, Funcionario codFuncionario) {
        this.setUsuario(usuario);
        this.setContrasena(contrasena);
        this.setCodFuncionario(codFuncionario);
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

    public Funcionario getCodFuncionario() {
        return this.codFuncionario;
    }

    public void setCodFuncionario(Funcionario codFuncionario) {
        this.codFuncionario = codFuncionario;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Usuario other = (Usuario) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}*/
