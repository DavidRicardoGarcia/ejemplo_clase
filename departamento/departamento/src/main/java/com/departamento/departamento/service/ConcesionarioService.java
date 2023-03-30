package com.departamento.departamento.service;

import com.departamento.departamento.entity.Vehiculo;
// Importing required classes
import java.util.List;
 
// Interface
public interface ConcesionarioService {
 
    // Save operation
    Vehiculo venderVehiculo(Vehiculo vehiculo);
 
    // Read operation
    List<Vehiculo> listaVehiculos();
 

}