package com.siet.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siet.app.model.Elemento;

public interface ElementoRepository extends JpaRepository<Elemento,Integer>{
    
}
