package com.example.aws.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exampleController {

    @GetMapping("/saludo")
    public String Saludo(){
        return "Hola desde mi api";
    }
}
