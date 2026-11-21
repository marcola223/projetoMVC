package com.Biblioteca.Biblioteca.model;

public class Livro {
    private String titulo;
    private String autor;
    private String isnb;

    public Livro() {
    }

    public Livro(String titulo, String autor, String isnb) {
        this.titulo = titulo;
        this.autor = autor;
        this.isnb = isnb;
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

    public String getIsnb() {
        return isnb;
    }

    public void setIsnb(String isnb) {
        this.isnb = isnb;
    }
}