package com.departamento.departamento.controller;

import org.springframework.web.bind.annotation.*;
 
// Annotation
@RestController
 
// Class
public class EscolarController {
 
    @GetMapping("/estudiantes")
    public String listaEstudiantes()
    {   System.out.println("get medico");
        return " Lista de estudiantes";
    }

 
}