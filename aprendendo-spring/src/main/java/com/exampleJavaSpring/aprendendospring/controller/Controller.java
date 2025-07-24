package com.exampleJavaSpring.aprendendospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping ("/")
    public String olaMundo(){
        return "seja bem vindo";
    }
}
