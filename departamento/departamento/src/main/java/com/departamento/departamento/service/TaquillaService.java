package com.departamento.departamento.service;

import com.departamento.departamento.entity.Boleta;
import com.departamento.departamento.entity.Usuario;

// Interface
public interface TaquillaService {
 
    // Save operation
    Boleta venderBoleta(Boleta boleta);

    Usuario crearUsuario(Usuario usuario);
 
    // Read operation
    int cantidadBoletasVendidas();
 

}