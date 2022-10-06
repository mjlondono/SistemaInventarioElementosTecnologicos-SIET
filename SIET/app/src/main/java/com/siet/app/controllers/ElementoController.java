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

        /*if(elementoViewModel.getPlaca() == null){

            elementoViewModel.mensajes.add("Error creando el elemento, Debe ingresar todos los campos.");
            return "elemento/ingresar";

        }*/

        if(elementoViewModel.getNombre() == null || elementoViewModel.getNombre().isEmpty()){

            elementoViewModel.mensajes.add("Error creando el elemento, Debe ingresar todos los campos.");
            return "elemento/ingresar";

        }

        if(elementoViewModel.getModelo() == null || elementoViewModel.getModelo().isEmpty()){

            elementoViewModel.mensajes.add("Error creando el elemento, Debe ingresar todos los campos.");
            return "elemento/ingresar";

        }

        if(elementoViewModel.getMarca() == null || elementoViewModel.getMarca().isEmpty()){

            elementoViewModel.mensajes.add("Error creando el elemento, Debe ingresar todos los campos.");
            return "elemento/ingresar";

        }

        if(elementoViewModel.getSerial() == null || elementoViewModel.getSerial().isEmpty()){

            elementoViewModel.mensajes.add("Error creando el elemento, Debe ingresar todos los campos.");
            return "elemento/ingresar";

        }

        if(elementoViewModel.getIdArea() == null){

            elementoViewModel.mensajes.add("Error creando el elemento, Debe ingresar todos los campos.");
            return "elemento/ingresar";

        }

        if(elementoViewModel.getCodFuncionario() == null){

            elementoViewModel.mensajes.add("Error creando el elemento, Debe ingresar todos los campos.");
            return "elemento/ingresar";

        }

        if(elementoViewModel.getIdEstado() == null){

            elementoViewModel.mensajes.add("Error creando el elemento, Debe ingresar todos los campos.");
            return "elemento/ingresar";

        }

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
            elementoViewModel.mensajes.add("ERROR creando el elemento, intentelo de nuevo.");
            return "elemento/ingresar";
        }

        elementoViewModel.mensajes.add("Elemento CREADO correctamente.");
        return "elemento/ingresar";

    }

    @RequestMapping(value = "buscar")
    public String buscar(ElementoViewModel elementoViewModel){

        return "elemento/buscar";
    }

    @RequestMapping(value = "buscar", method = RequestMethod.POST)
    public String buscarPost(ElementoViewModel elementoViewModel) {

        if(elementoViewModel.getPlaca() == null){

            elementoViewModel.mensajes.add("ERROR al BUSCAR el ELEMENTO, Debe ingresar todos los campos.");
            return "elemento/buscar";

        }
        Optional<Elemento> elmSearchedOptional = elmRepo.findById(elementoViewModel.getPlaca());
        if (!elmSearchedOptional.isPresent()) {
            elementoViewModel.mensajes.add("Elemento NO ENCONTRADO en la DB con la PLACA indicada");
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
            elementoViewModel.mensajes.add("El ELEMENTO se ELIMINO correctamente.");
            return "elemento/buscar";
        } else {
            elementoViewModel.mensajes.add("INGRESE una PLACA valida para ELIMINAR");
            return "elemento/buscar";
        }
        
    }

    @RequestMapping(value = "actualizar")
    public String actualizar(ElementoViewModel elementoViewModel){
        Optional<Elemento> elmSearchedOptional = elmRepo.findByPlaca(elementoViewModel.getPlaca());
        if (elmSearchedOptional.isPresent()) {

            Elemento elmSearched = elmSearchedOptional.get();
            elementoViewModel.setPlaca(elmSearched.getPlaca());
            elementoViewModel.setNombre(elmSearched.getNombre());
            elementoViewModel.setMarca(elmSearched.getMarca());
            elementoViewModel.setModelo(elmSearched.getModelo());
            elementoViewModel.setSerial(elmSearched.getSerial());
            elementoViewModel.setIdArea(elmSearched.getIdArea());
            elementoViewModel.setCodFuncionario(elmSearched.getCodFuncionario());
            elementoViewModel.setIdEstado(elmSearched.getIdEstado());
            
            return "elemento/actualizar";
        } else {
            elementoViewModel.mensajes.add("INGRESE un ELEMENTO valido para ACTUALIZAR");
            return "elemento/buscar";
        }
    }

    @RequestMapping(value = "actualizar_elemento", method = RequestMethod.POST)
    public String actualizarPost(ElementoViewModel elementoViewModel) {
        Optional<Elemento> elmSearchedOptional = elmRepo.findById(elementoViewModel.getPlaca());
        if (elmSearchedOptional.isPresent()) {
            // proceso de actualizacion
            Elemento elmSearched = elmSearchedOptional.get();
             
            elmSearched.setNombre(elementoViewModel.getNombre());
            elmSearched.setMarca(elementoViewModel.getMarca());
            elmSearched.setModelo(elementoViewModel.getModelo());
            elmSearched.setSerial(elementoViewModel.getSerial());
            elmSearched.setIdArea(elementoViewModel.getIdArea());
            elmSearched.setCodFuncionario(elementoViewModel.getCodFuncionario());
            elmSearched.setIdEstado(elementoViewModel.getIdEstado());

            Elemento elmUpdated = elmRepo.save(elmSearched);
            Boolean validation = (elmUpdated.getNombre() == elementoViewModel.getNombre() && elmSearched.getMarca() == elementoViewModel.getMarca());
            if(validation){
                elementoViewModel.mensajes.add("El ELEMENTO fue ACTUALIZADO correctamente.");
                return "elemento/buscar";   
            }
            elementoViewModel.mensajes.add("ERROR al ACTUALIZAR, por favor intentelo de nuevo.");
            return "elemento/buscar";
        } else {
            elementoViewModel.mensajes.add("Por favor INGRESE una PLACA VALIDA para actualizar.");
            return "elemento/buscar";
        }

    }

    @RequestMapping(value = "informes")
    public String informes(ElementoViewModel elementoViewModel){
        elementoViewModel.searchResults = elmRepo.findAll();
        return "elemento/informes";
    }

    /*@RequestMapping(value = "informes_filtro", method = RequestMethod.POST)
    public String informesFiltro(ElementoViewModel elementoViewModel) {

        elementoViewModel.searchResults = elmRepo.findByEstado(elementoViewModel.getIdEstado());

        if(elementoViewModel.getIdEstado() == null){

            elementoViewModel.mensajes.add("ERROR al BUSCAR el ELEMENTO, Debe ingresar todos los campos.");
            return "elemento/buscar";

        }
        Optional<Elemento> elmSearchedOptional = elmRepo.findById(elementoViewModel.getPlaca());
        if (!elmSearchedOptional.isPresent()) {
            elementoViewModel.mensajes.add("Elemento NO ENCONTRADO en la DB con la PLACA indicada");
            return "elemento/buscar";
        }
        elementoViewModel.searchResults.add(elmSearchedOptional.get());
        return "elemento/buscar";
    }*/

       
}
