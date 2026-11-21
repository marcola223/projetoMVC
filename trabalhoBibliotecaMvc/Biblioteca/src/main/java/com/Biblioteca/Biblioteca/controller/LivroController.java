package com.Biblioteca.Biblioteca.controller;

import com.Biblioteca.Biblioteca.model.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/livros")
public class LivroController {

    private List<Livro> livros = new ArrayList<>();

    @GetMapping
    public String exibirPagina(Model model) {
        model.addAttribute("livros", livros);

        model.addAttribute("novoLivro", new Livro());

        return "livros/inicio";
    }

    @PostMapping
    public String cadastrar(@ModelAttribute Livro novoLivro) {
        livros.add(novoLivro);

        return "redirect:/livros";
    }

    @DeleteMapping("/{id}")
    public String excluirLivro(@PathVariable int id) {
        if (livros != null && id >= 0 && id < livros.size()) {
            livros.remove(id);
        }
        return "redirect:/livros";
    }

    @GetMapping("/editar/{id}")
    public String exibirFormularioEdicao(@PathVariable int id, Model model) {
        if (id >= 0 && id < livros.size()) {
            model.addAttribute("livroExistente", livros.get(id));
            model.addAttribute("id", id);
            return "livros/editar";
        }
        return "redirect:/livros";
    }

    @PostMapping("/editar/{id}")
    public String atualizar(@PathVariable int id, @ModelAttribute Livro livroAtualizado) {
        if (id >= 0 && id < livros.size()) {
            livros.set(id, livroAtualizado);
        }
        return "redirect:/livros";
    }
}