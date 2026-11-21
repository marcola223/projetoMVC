package com.Biblioteca.Biblioteca.controller;

import com.Biblioteca.Biblioteca.model.Emprestimo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/emprestimos")
public class EmprestimoController {

    private List<Emprestimo> emprestimos = new ArrayList<>();

    @GetMapping
    public String exibirPagina(Model model) {
        model.addAttribute("emprestimos", emprestimos);
        model.addAttribute("novoEmprestimo", new Emprestimo());

        return "emprestimos/inicio";
    }

    @PostMapping
    public String cadastrar(@ModelAttribute Emprestimo novoEmprestimo) {
        emprestimos.add(novoEmprestimo);
        return "redirect:/emprestimos";
    }

    @DeleteMapping("/{id}")
    public String excluir(@PathVariable int id) {
        if (emprestimos != null && id >= 0 && id < emprestimos.size()) {
            emprestimos.remove(id);
        }
        return "redirect:/emprestimos";
    }

    @GetMapping("/editar/{id}")
    public String exibirFormularioEdicao(@PathVariable int id, Model model) {
        if (id >= 0 && id < emprestimos.size()) {
            model.addAttribute("emprestimoExistente", emprestimos.get(id));
            model.addAttribute("id", id);
            return "emprestimos/editar";
        }
        return "redirect:/emprestimos";
    }

    @PostMapping("/editar/{id}")
    public String atualizar(@PathVariable int id, @ModelAttribute Emprestimo emprestimoAtualizado) {
        if (id >= 0 && id < emprestimos.size()) {
            emprestimos.set(id, emprestimoAtualizado);
        }
        return "redirect:/emprestimos";
    }
}