package com.exampleJavaSpring.aprendendospring.controller;

import com.exampleJavaSpring.aprendendospring.model.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping ("/")
    public String olaMundo(){
        return "seja bem vindo";
    }

    Usuario usuario = new Usuario("Edson victor ", "cruz.menezes@outlook.com", "1234566789");

    @GetMapping("/usuario")
    public Usuario getUsuario() {
        return usuario;
    }
}
