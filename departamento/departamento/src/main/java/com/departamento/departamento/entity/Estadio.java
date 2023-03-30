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
public class Estadio {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long estadioId;
    private String estadioNombre;
    private int estadioCapacidadNorte;
    private int estadioCapacidadSur;
    private int estadioCapacidadOriente;
    private int estadioCapacidadOccidente;
    private double estadioPrecioNorte;
    private double estadioPrecioSur;
    private double estadioPrecioOriente;
    private double estadioPrecioOccidente;


}