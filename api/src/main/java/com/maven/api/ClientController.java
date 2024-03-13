package com.maven.api;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ClientController {
    

    @GetMapping("/")
    public String saludo() {
        return "Hola como estas?";
    }
    
}
