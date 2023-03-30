package com.departamento.departamento.controller;

import org.springframework.web.bind.annotation.*;
import com.departamento.departamento.entity.Medico;
import com.departamento.departamento.entity.Cita;
import com.departamento.departamento.service.MedicoService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
// Annotation
@RestController
 
// Class
public class MedicoController {

    @Autowired private MedicoService medicoService;
   
 
    // Save operation
    @PostMapping("/crearmedico")
    //@PostMapping(value = "/Vehiculos", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Medico saveMedico(
        @Valid @RequestBody Medico medico)
    {   
        return medicoService.crearMedico(medico);
    }

    // Save operation
    @PostMapping("/crearcita")
    //@PostMapping(value = "/Vehiculos", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Cita saveCita(
        @Valid @RequestBody Cita cita)
    {   
        return medicoService.crearCita(cita);
    }
 
    // Read operation
    @GetMapping("/medicos")
    //@RequestMapping(value = "/Vehiculos", method = RequestMethod.GET)
    public List<Medico> listarMedicos()
    {   
        return medicoService.listaMedicos();
    }

 
}