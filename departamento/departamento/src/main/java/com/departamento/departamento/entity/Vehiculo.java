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
public class Vehiculo {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vehiculoId;
    private String vehiculoMarca;
    private String vehiculoModelo;
    private String vehiculoColor;
    private double vehiculoKm;
    private double vehiculoPrecio;

}