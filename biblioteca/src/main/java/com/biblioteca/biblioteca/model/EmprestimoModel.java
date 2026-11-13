package com.biblioteca.biblioteca.model;

import java.time.LocalDate;

public class EmprestimoModel {
    private LocalDate dataEmprestimo;
    private LocalDate dataEntrega;

    public EmprestimoModel(LocalDate dataEmprestimo, LocalDate dataEntrega) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataEntrega = dataEntrega;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}
