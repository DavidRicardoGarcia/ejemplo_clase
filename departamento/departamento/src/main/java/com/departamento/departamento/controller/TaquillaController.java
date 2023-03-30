package com.departamento.departamento.controller;

import org.springframework.web.bind.annotation.*;
 
// Annotation
@RestController
 
// Class
public class TaquillaController {
 
    @GetMapping("/boletasvendidas")
    public String getBoletasVendidas()
    {   
        return "cantidad de boletas vendidas";
    }

 
}