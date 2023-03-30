package com.departamento.departamento.service;


import com.departamento.departamento.entity.Cita;
import com.departamento.departamento.entity.Medico;
// Importing required classes
import java.util.List;
 
// Interface
public interface MedicoService {
 
    // Save operation
    Cita crearCita(Cita cita);

    // Save operation
    Medico crearMedico(Medico medico);
 
    // Read operation
    List<Medico> listaMedicos();
 

}