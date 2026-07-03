package com.samdev.libreria_api.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
public class Libro {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private Integer anioDePublicacion;

    private Integer cantidad;

    @Column(unique = true)
    private String isbn;

    private String descripcion;

    private BigDecimal precio;

    @ManyToOne
    private Autor autor;

    @ManyToOne
    private Categoria categoria;

    public Libro() {

    }

    public Libro(String titulo, Integer anioDePublicacion, Integer cantidad, String isbn, String descripcion, BigDecimal precio) {
        this.titulo = titulo;
        this.anioDePublicacion = anioDePublicacion;
        this.cantidad = cantidad;
        this.isbn = isbn;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnioDePublicacion() {
        return anioDePublicacion;
    }

    public void setAnioDePublicacion(Integer anioDePublicacion) {
        this.anioDePublicacion = anioDePublicacion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
