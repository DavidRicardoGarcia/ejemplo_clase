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
public class Medico {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long medicoId;
    private String medicoNombre;
    private String medicoApellido;
    private String medicoIdentificacion;
    private String medicoTarjetaProfesional;
    private String medicoDireccion;
    private String medicoTelefono;
    private String medicoCorreo;
    private String medicoNombreEspecialidad;
}