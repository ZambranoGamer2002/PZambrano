package com.zambrano.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @Column(name = "prd_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prodId;

    @Column(name = "prd_name")
    private String prodNombre;

    @Column(name = "prd_descrip")
    private String prodDescripcion;

    @Column(name = "prd_fecha_venci")
    private String prodFechaVencimiento;

    @Column(name = "prd_precio")
    private String prodPrecio;

    @Column(name = "prod_cantidad")
    private String prodCantidad;
}

