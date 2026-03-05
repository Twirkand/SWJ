package com.docencia.ejercicio.clases.dos;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;

    public Libro(String isbn) {
 
    }

    public Libro(String titulo, String autor, String isbn) {

    }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) {
        this.isbn = isbn;

    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return isbn.toUpperCase().hashCode();
    }

    @Override
    public String toString() {
        return "";
    }
}

