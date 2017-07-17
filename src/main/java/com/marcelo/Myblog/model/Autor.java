package com.marcelo.Myblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author danilo
 */

@Entity
@Table(name = "livro")
public class Autor extends AbstractEntity {
    
    @Column(length = 255)
    private String titulo;
    
    @Column(length = 255)
    private String autor;
    
    @Column(length = 255)
    private String editora;

    @Column(length = 255)
    private String categoria;
    
    @Column(length = 255)
    private String tipo;

    public Autor() {
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", categoria=" + categoria + ", tipo=" + tipo + '}';
    }
    
}
