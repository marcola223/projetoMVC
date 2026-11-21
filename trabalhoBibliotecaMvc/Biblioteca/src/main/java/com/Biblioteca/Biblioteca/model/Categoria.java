package com.Biblioteca.Biblioteca.model;

public class Categoria {
    private String genero;
    private String descricao;
    private String classificacaoIndicativa;

    public Categoria() {
    }

    public Categoria(String genero, String descricao, String classificacaoIndicativa) {
        this.genero = genero;
        this.descricao = descricao;
        this.classificacaoIndicativa = classificacaoIndicativa;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public void setClassificacaoIndicativa(String classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }
}