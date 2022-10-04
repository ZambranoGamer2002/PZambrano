package com.zambrano.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @Column(name = "ct_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cateId;

    @Column(name = "ct_name")
    private String cateNombre;

    @Column(name = "ct_info")
    private String cateInfo;

    @ManyToOne //De muchos a uno
    @JoinColumn(name = "prd_id")
    private Producto producto;
}
