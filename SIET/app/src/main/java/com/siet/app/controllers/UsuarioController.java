package com.siet.app.controllers;

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
public class UsuarioController {

    @Autowired
    UsuarioRepository usrRepo;

    @RequestMapping(value = "registrar")
    public String index(UsuarioViewModel usuarioViewModel){
        return "usuario/registrar";
    }

    @RequestMapping(value = "registrar", method = RequestMethod.POST)
    public String registrarPost(UsuarioViewModel usuarioViewModel){


        if(usuarioViewModel.getUsuario() == null || usuarioViewModel.getUsuario().isEmpty()){

            usuarioViewModel.mensajes.add("Error creando el usuario, Debe ingresar todos los campos.");
            return "usuario/registrar";

        }

        if(usuarioViewModel.getContrasena() == null || usuarioViewModel.getContrasena().isEmpty()){

            usuarioViewModel.mensajes.add("Error creando el usuario, Debe ingresar todos los campos.");
            return "usuario/registrar";

        }

        if(usuarioViewModel.getCodFuncionario() == null){

            usuarioViewModel.mensajes.add("Error creando el usuario, Debe ingresar todos los campos.");
            return "usuario/registrar";

        }
        
        Usuario usrToSave = new Usuario(
                usuarioViewModel.getUsuario(),
                usuarioViewModel.getContrasena(),
                usuarioViewModel.getCodFuncionario()
                );
                Usuario usrSaved = usrRepo.save(usrToSave);
        if (!(usrSaved.getId() != null && usrSaved.getId() > 0)) {
            usuarioViewModel.mensajes.add("Error creando el usuario, intentelo de nuevo.");
            return "usuario/registrar";
        }
        usuarioViewModel.mensajes.add("Usuario creado correctamente.");
        return "usuario/registrar";

    }
 

}
