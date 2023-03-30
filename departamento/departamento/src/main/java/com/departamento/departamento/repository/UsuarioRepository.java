package com.departamento.departamento.repository;

// Importing required classes
import com.departamento.departamento.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
// Annotation
@Repository
 
// Interface
public interface UsuarioRepository
    extends JpaRepository<Usuario, Long> {
}

