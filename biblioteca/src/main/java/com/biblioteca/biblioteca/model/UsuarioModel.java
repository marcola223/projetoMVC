package com.biblioteca.biblioteca.model;

import java.time.LocalDate;

public class UsuarioModel {
    private String nomeUser;
    private String cpf;
    private LocalDate dataNascimento;

    public UsuarioModel(String nomeUser, String cpf, LocalDate dataNascimento) {
        this.nomeUser = nomeUser;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
