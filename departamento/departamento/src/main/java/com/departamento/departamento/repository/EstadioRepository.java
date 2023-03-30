package com.departamento.departamento.repository;

// Importing required classes
import com.departamento.departamento.entity.Estadio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
// Annotation
@Repository
 
// Interface
public interface EstadioRepository
    extends JpaRepository<Estadio, Long> {
}

