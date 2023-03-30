package com.departamento.departamento.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.departamento.departamento.service.TaquillaService;
import java.util.List;
import javax.validation.Valid;
import com.departamento.departamento.entity.Boleta;
import com.departamento.departamento.entity.Usuario;
// Annotation
@RestController
 
// Class
public class TaquillaController {

    @Autowired private TaquillaService taquillaService;
 
    // Save operation
    @PostMapping("/venderboleta")
    //@PostMapping(value = "/Vehiculos", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Boleta saveBoleta(
        @Valid @RequestBody Boleta boleta)
    {   
        return taquillaService.venderBoleta(boleta);
    }
 
    // Save operation
    @PostMapping("/crearusuario")
    //@PostMapping(value = "/Vehiculos", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Usuario saveUsuario(
        @Valid @RequestBody Usuario usuario)
    {   
        return taquillaService.crearUsuario(usuario);
    }

    // Read operation
    @GetMapping("/boletasvendidas")
    //@RequestMapping(value = "/Vehiculos", method = RequestMethod.GET)
    public int totalBoletasVendidas()
    {   
        return taquillaService.cantidadBoletasVendidas();
    }
 
}