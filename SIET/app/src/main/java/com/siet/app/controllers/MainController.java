package com.siet.app.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.siet.app.model.Usuario;
import com.siet.app.repository.UsuarioRepository;
import com.siet.app.viewmodel.UsuarioViewModel;

@Controller
@CrossOrigin
public class MainController {


    @Autowired
    UsuarioRepository uRepo;

    @RequestMapping(value = "/")
    public String index(UsuarioViewModel usuarioViewModel){
        return "index";
    }

    @RequestMapping(value = "/login")
    public String login(UsuarioViewModel usuarioViewModel){
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPost(UsuarioViewModel usuarioViewModel){
        
        Optional<Usuario> usrSearchedOptional = uRepo.findByUsuarioAndContrasena(usuarioViewModel.getUsuario(), usuarioViewModel.getContrasena());

        if(usrSearchedOptional.isEmpty()){
            
            usuarioViewModel.mensajes.add("Usuario No Valido");
            return "index";
        }
        
        return "menuprincipal";       
    }

    @RequestMapping(value = "menuprincipal")
    public String regresar(){
        return "menuprincipal";
    }

}
