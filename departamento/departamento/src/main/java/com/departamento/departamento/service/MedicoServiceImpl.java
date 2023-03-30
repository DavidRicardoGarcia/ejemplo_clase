package com.departamento.departamento.service;

 
import com.departamento.departamento.entity.Cita;
import com.departamento.departamento.entity.Medico;
import com.departamento.departamento.entity.Paciente;
import com.departamento.departamento.repository.CitaRepository;
import com.departamento.departamento.repository.MedicoRepository;
import com.departamento.departamento.repository.PacienteRepository;
// Importing required classes
import java.util.List;
//import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
// Annotation
@Service
 
// Class
public class MedicoServiceImpl
    implements MedicoService {
 
    @Autowired
    private CitaRepository citaRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private MedicoRepository medicoRepository;
 
    // Save operation
    @Override
    public Cita crearCita(Cita cita)
    {
        return citaRepository.save(cita);
    }

    // Save operation
    @Override
    public Medico crearMedico(Medico medico)
    {
        return medicoRepository.save(medico);
    }

    // Read operation
    @Override public List<Medico> listaMedicos()
    {
        return (List<Medico>)
            medicoRepository.findAll();
    }
 

}