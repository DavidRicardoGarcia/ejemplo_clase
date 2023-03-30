package com.departamento.departamento.controller;

import org.springframework.web.bind.annotation.*;
 
// Annotation
@RestController
 
// Class
public class MedicoController {
 
    @GetMapping("/medicos")
    public String listaMedicos()
    {   System.out.println("listar medicos");
        return "Lista de Medicos";
    }

 
}