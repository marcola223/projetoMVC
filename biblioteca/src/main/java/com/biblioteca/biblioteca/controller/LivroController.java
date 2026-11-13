package com.biblioteca.biblioteca.controller;

import com.biblioteca.biblioteca.model.LivroModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/livros")
public class LivroController {
    @GetMapping
    public String inicio(){
        return "livros/inicio";
    }

    @GetMapping
    public String exibirLivro(Model model ) {
        LivroModel livro = new LivroModel();
        livro.setTitulo("Dom Casmurro");
        livro.setAutor("Machado de Assis");
        livro.setIsbn("978-85-00-00000-0");

        model.addAttribute("livro", livro);

        return "livro";

    }

}


