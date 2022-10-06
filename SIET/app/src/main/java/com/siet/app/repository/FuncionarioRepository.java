package com.siet.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siet.app.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario,Integer>{
    
}
