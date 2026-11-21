package com.Biblioteca.Biblioteca.controller;

import com.Biblioteca.Biblioteca.model.Autor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/autores")
public class AutorController {

    private List<Autor> autores = new ArrayList<>();

    @GetMapping
    public String exibirPagina(Model model) {
        model.addAttribute("autores", autores);

        model.addAttribute("novoAutor", new Autor());

        return "autores/inicio";
    }

    @PostMapping
    public String cadastrar(@ModelAttribute Autor novoAutor) {
        autores.add(novoAutor);

        return "redirect:/autores";
    }

    @DeleteMapping("/{id}")
    public String excluirAutor(@PathVariable int id) {
        if (autores != null && id >= 0 && id < autores.size()) {
            autores.remove(id);
        }
        return "redirect:/autores";
    }

    @GetMapping("/editar/{id}")
    public String exibirFormularioEdicao(@PathVariable int id, Model model) {
        if (id >= 0 && id < autores.size()) {
            model.addAttribute("autorExistente", autores.get(id));
            model.addAttribute("id", id);
            return "autores/editar";
        }
        return "redirect:/autores";
    }

    @PostMapping("/editar/{id}")
    public String atualizar(@PathVariable int id, @ModelAttribute Autor autorAtualizado) {
        if (id >= 0 && id < autores.size()) {
            autores.set(id, autorAtualizado);
        }
        return "redirect:/autores";
    }
}