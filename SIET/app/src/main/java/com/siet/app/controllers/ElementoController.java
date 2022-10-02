package com.siet.app.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.siet.app.model.Elemento;
import com.siet.app.repository.ElementoRepository;
import com.siet.app.viewmodel.ElementoViewModel;

@Controller
@CrossOrigin
public class ElementoController {

    @Autowired
    ElementoRepository elmRepo;

    @RequestMapping(value = "ingresar")
    public String index(ElementoViewModel elementoViewModel){
        return "elemento/ingresar";
    }
    
    @RequestMapping(value = "ingresar", method = RequestMethod.POST)
    public String registrarPost(ElementoViewModel elementoViewModel){

        Elemento elmToSave = new Elemento(
                elementoViewModel.getPlaca(),
                elementoViewModel.getNombre(),
                elementoViewModel.getMarca(),
                elementoViewModel.getModelo(),
                elementoViewModel.getSerial(),
                elementoViewModel.getIdArea(),
                elementoViewModel.getCodFuncionario(),
                elementoViewModel.getIdEstado()
                );

                Elemento elmSaved = elmRepo.save(elmToSave);
        if (!(elmSaved.getPlaca() != null && elmSaved.getPlaca() > 0)) {
            elementoViewModel.mensajes.add("Error creando el elemento, intentelo de nuevo.");
            return "elemento/ingresar";
        }

        elementoViewModel.mensajes.add("Elemento creado correctamente.");
        return "elemento/ingresar";

    }

    @RequestMapping(value = "buscar")
    public String buscar(ElementoViewModel elementoViewModel){
        //elementoViewModel.searchResults = elmRepo.findAll();
        return "elemento/buscar";
    }

    @RequestMapping(value = "buscar", method = RequestMethod.POST)
    public String buscarPost(ElementoViewModel elementoViewModel) {
        Optional<Elemento> elmSearchedOptional = elmRepo.findById(elementoViewModel.getPlaca());
        if (!elmSearchedOptional.isPresent()) {
            elementoViewModel.mensajes.add("Elemento no encontrado en la DB con la PLACA indicada");
            return "elemento/buscar";
        }
        elementoViewModel.searchResults.add(elmSearchedOptional.get());
        return "elemento/buscar";
    }

    @RequestMapping(value = "eliminar", method = RequestMethod.POST)
    public String eliminarPost(ElementoViewModel elementoViewModel) {
        Optional<Elemento> elmSearchedOptional = elmRepo.findById(elementoViewModel.getPlaca());
        if (elmSearchedOptional.isPresent()) {
            Elemento elmSearched = elmSearchedOptional.get();
            elmRepo.delete(elmSearched);
            elementoViewModel.mensajes.add("El Elemento se elimino correctamente.");
            return "elemento/buscar";
        } else {
            elementoViewModel.mensajes.add("Ingrese una PLACA valida para eliminar");
            return "elemento/buscar";
        }
        
    }

    @RequestMapping(value = "informes")
    public String informes(ElementoViewModel elementoViewModel){
        elementoViewModel.searchResults = elmRepo.findAll();
        return "elemento/informes";
    }
    
 
}
