package com.departamento.departamento.service;

 
import com.departamento.departamento.entity.Vehiculo;
import com.departamento.departamento.repository.VehiculoRepository;
// Importing required classes
import java.util.List;
//import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
// Annotation
@Service
 
// Class
public class ConcesionarioServiceImpl
    implements ConcesionarioService {
 
    @Autowired
    private VehiculoRepository vehiculoRepository;
 
    // Save operation
    @Override
    public Vehiculo venderVehiculo(Vehiculo Vehiculo)
    {
        return vehiculoRepository.save(Vehiculo);
    }
 
    // Read operation
    @Override public List<Vehiculo> listaVehiculos()
    {
        return (List<Vehiculo>)
            vehiculoRepository.findAll();
    }
 
   
}