package com.Biblioteca.Biblioteca.controller;

import com.Biblioteca.Biblioteca.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();

    @GetMapping
    public String exibirPagina(Model model) {
        model.addAttribute("usuarios", usuarios);
        model.addAttribute("novoUsuario", new Usuario());
        return "usuarios/inicio";
    }

    @PostMapping
    public String cadastrar(@ModelAttribute Usuario novoUsuario) {
        usuarios.add(novoUsuario);
        return "redirect:/usuarios";
    }

    @DeleteMapping("/{id}")
    public String excluir(@PathVariable int id) {
        if (usuarios != null && id >= 0 && id < usuarios.size()) {
            usuarios.remove(id);
        }
        return "redirect:/usuarios";
    }

    @GetMapping("/editar/{id}")
    public String exibirFormularioEdicao(@PathVariable int id, Model model) {
        if (id >= 0 && id < usuarios.size()) {
            model.addAttribute("usuarioExistente", usuarios.get(id));
            model.addAttribute("id", id);
            return "usuarios/editar";
        }
        return "redirect:/usuarios";
    }

    @PostMapping("/editar/{id}")
    public String atualizar(@PathVariable int id, @ModelAttribute Usuario usuarioAtualizado) {
        if (id >= 0 && id < usuarios.size()) {
            usuarios.set(id, usuarioAtualizado);
        }
        return "redirect:/usuarios";
    }
}