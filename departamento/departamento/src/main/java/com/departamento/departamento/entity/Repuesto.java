package com.departamento.departamento.entity;

// Importing required classes
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

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
public class Repuesto {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long repuestoId;
    private String repuestoNombreCliente;
    private String repuestoVehiculo;
    private String repuestoNombreMecanico;
    private String repuestoDetalle;
    private Date repuestoFechainicio;
    private Date repuestoFechaEntrega;

}