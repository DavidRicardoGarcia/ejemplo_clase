package com.departamento.departamento.entity;

// Importing required classes
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
// Annotations
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
 
// Class
public class Paciente {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long pacienteId;
    private String pacienteNombre;
    private String pacienteApellido;
    private String pacienteIdentificacion;
    private String pacienteFechaNacimiento;
    private String pacienteDireccion;
    private String pacienteTelefono;
    private String pacienteCorreo;
}