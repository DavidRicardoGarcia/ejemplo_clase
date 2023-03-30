package com.departamento.departamento.service;

 
import com.departamento.departamento.entity.Usuario;
import com.departamento.departamento.entity.Boleta;
import com.departamento.departamento.repository.BoletaRepository;
import com.departamento.departamento.repository.UsuarioRepository;
// Importing required classes
import java.util.List;
//import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
// Annotation
@Service
 
// Class
public class TaquillaServiceImpl
    implements TaquillaService {
 
    @Autowired
    private BoletaRepository boletaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;
 
    // Save operation
    @Override
    public Boleta venderBoleta(Boleta boleta)
    {
        return boletaRepository.save(boleta);
    }

    // Save operation
    @Override
    public Usuario crearUsuario(Usuario usuario)
    {
        return usuarioRepository.save(usuario);
    }
     
 
    // Read operation
    @Override public int cantidadBoletasVendidas()
    {   List<Boleta> boletas=(List<Boleta>)boletaRepository.findAll();
        return boletas.size();
    }
 
        
   
}