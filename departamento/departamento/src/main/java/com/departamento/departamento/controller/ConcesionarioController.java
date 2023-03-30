package com.departamento.departamento.controller;

import org.springframework.web.bind.annotation.*;
 
// Annotation
@RestController
 
// Class
public class ConcesionarioController {
 
    @GetMapping("/carrosvendidos")
    public String listaCarros()
    {   System.out.println("get medico");
        return "lista de carros vendidos";
    }

 
}