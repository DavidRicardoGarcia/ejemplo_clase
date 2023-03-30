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
public class Usuario {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long usuarioId;
    private String usuarioNombre;
    private String usuarioApellido;
    private String usuarioIdentificacion;
    private String usuarioFechaNacimiento;
    private String usuarioDireccion;
    private String usuarioTelefono;
    private String usuarioCorreo;
}