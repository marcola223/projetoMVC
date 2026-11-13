package com.biblioteca.biblioteca.model;

public class categoriaModel {
    private String Classificao;
    private String genero;

    public categoriaModel(String classifição, String genero) {
        Classificao = classifição;
        this.genero = genero;
    }

    public String getClassificao() {
        return Classificao;
    }

    public void setClassificao(String classificao) {
        Classificao = classificao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
