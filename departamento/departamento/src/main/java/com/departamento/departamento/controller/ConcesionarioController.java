package com.departamento.departamento.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.departamento.departamento.entity.Vehiculo;
import com.departamento.departamento.service.ConcesionarioService;
import java.util.List;
import javax.validation.Valid;
// Annotation
@RestController
 
// Class
public class ConcesionarioController {

    @Autowired private ConcesionarioService concesionarioService;
 
    // Save operation
    @PostMapping("/vendercarro")
    //@PostMapping(value = "/Vehiculos", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Vehiculo saveVehiculo(
        @Valid @RequestBody Vehiculo Vehiculo)
    {   System.out.println("post a dept");
        return concesionarioService.venderVehiculo(Vehiculo);
    }
 
    // Read operation
    @GetMapping("/carrosvendidos")
    //@RequestMapping(value = "/Vehiculos", method = RequestMethod.GET)
    public List<Vehiculo> fetchVehiculoList()
    {   System.out.println("get all dept");
        return concesionarioService.listaVehiculos();
    }

 
}