package com.Biblioteca.Biblioteca.model;

public class Emprestimo {
    private String dataEmprestimo;
    private String dataDevolucao;
    private String livroEmprestado;

    public Emprestimo() {
    }

    public Emprestimo(String dataEmprestimo, String dataDevolucao, String livroEmprestado) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.livroEmprestado = livroEmprestado;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getLivroEmprestado() {
        return livroEmprestado;
    }

    public void setLivroEmprestado(String livroEmprestado) {
        this.livroEmprestado = livroEmprestado;
    }
}