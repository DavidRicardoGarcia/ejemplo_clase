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
public class Cliente {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long clienteId;
    private String clienteNombre;
    private String clienteApellido;
    private double clienteNit;
    private double clienteTelefono;
    private double clienteDireccion;

}