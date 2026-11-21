package com.Biblioteca.Biblioteca.controller;

import com.Biblioteca.Biblioteca.model.Categoria;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    private List<Categoria> categorias = new ArrayList<>();

    @GetMapping
    public String exibirPagina(Model model) {
        model.addAttribute("categorias", categorias);
        model.addAttribute("novaCategoria", new Categoria());

        return "categorias/inicio";
    }

    @PostMapping
    public String cadastrar(@ModelAttribute Categoria novaCategoria) {
        categorias.add(novaCategoria);
        return "redirect:/categorias";
    }

    @DeleteMapping("/{id}")
    public String excluir(@PathVariable int id) {
        if (categorias != null && id >= 0 && id < categorias.size()) {
            categorias.remove(id);
        }
        return "redirect:/categorias";
    }

    @GetMapping("/editar/{id}")
    public String exibirFormularioEdicao(@PathVariable int id, Model model) {
        if (id >= 0 && id < categorias.size()) {
            model.addAttribute("categoriaExistente", categorias.get(id));
            model.addAttribute("id", id);
            return "categorias/editar";
        }
        return "redirect:/categorias";
    }

    @PostMapping("/editar/{id}")
    public String atualizar(@PathVariable int id, @ModelAttribute Categoria categoriaAtualizada) {
        if (id >= 0 && id < categorias.size()) {
            categorias.set(id, categoriaAtualizada);
        }
        return "redirect:/categorias";
    }
}