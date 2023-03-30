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
public class Cita {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long citaId;
    private String citaFecha;
    private String citaHora;
    private String citaTipoCita;
    private int citaConsultorio;
    private String citaNombreClinica;
    private String citaDireccionClinica;
    private String citaDiagnosticoFinal;
    private String citaPaciente;
    private String citaMedico;
    private String citaMedicamento;

}