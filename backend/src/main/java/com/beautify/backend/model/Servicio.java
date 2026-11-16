package com.beautify.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "servicios")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;        // Ej: "Corte básico"
    private String descripcion;
    private Double precio;        // Ej: 14.00
    private Integer duracionMin;  // Ej: 40 (minutos)

    @ManyToOne
    @JoinColumn(name = "negocio_id", nullable = false)
    private Negocio negocio;

    public Servicio() {}

    public Servicio(String nombre, String descripcion, Double precio, Integer duracionMin, Negocio negocio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.duracionMin = duracionMin;
        this.negocio = negocio;
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }

    public Integer getDuracionMin() { return duracionMin; }
    public void setDuracionMin(Integer duracionMin) { this.duracionMin = duracionMin; }

    public Negocio getNegocio() { return negocio; }
    public void setNegocio(Negocio negocio) { this.negocio = negocio; }
}