package com.siet.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin
public class MainController {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

}
