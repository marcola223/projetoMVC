package com.biblioteca.biblioteca.model;

public class AutorModel {
    private String Nome;
    private String nacionalidade;
    private String obrasPublicadas;

    public AutorModel(String nome, String nacionalidade, String obrasPublicadas) {
        Nome = nome;
        this.nacionalidade = nacionalidade;
        this.obrasPublicadas = obrasPublicadas;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getObrasPublicadas() {
        return obrasPublicadas;
    }

    public void setObrasPublicadas(String obrasPublicadas) {
        this.obrasPublicadas = obrasPublicadas;
    }
}
