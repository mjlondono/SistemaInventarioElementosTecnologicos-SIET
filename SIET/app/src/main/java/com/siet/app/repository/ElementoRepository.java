package com.siet.app.repository;

//import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import com.siet.app.model.Elemento;

public interface ElementoRepository extends JpaRepository<Elemento,Integer>{

    public Optional<Elemento> findByPlaca(Integer placa);

    public Optional<Elemento> findByIdEstado(Integer estado);

    

    //public List<Elemento> findByEstado(Integer estado);

    //@Query("select * from Elemento e where e.idEstado = 1")
    //public List<Elemento> findByEstado();



    
}
