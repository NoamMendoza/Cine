package com.alta.alta.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.alta.alta.models.AltaEstrenos;
import com.alta.alta.models.AltaPeliculas;
import com.alta.alta.service.AltaEstrenosService;
import com.alta.alta.service.AltaPeliculasService;


@Controller
public class AltaController {
    private final AltaEstrenosService altaEstrenosService;
    private final AltaPeliculasService altaPeliculasService;

    public AltaController(AltaEstrenosService altaEstrenosService, AltaPeliculasService altaPeliculasService) {
        this.altaEstrenosService = altaEstrenosService;
        this.altaPeliculasService = altaPeliculasService;
    }

    @GetMapping("/altaEstrenos/form")
    public String showEstrenosForm(Model model) {
        model.addAttribute("altaEstreno", new AltaEstrenos());
        return "alta-estrenos-form";
    }

    @PostMapping("/altaEstrenos/form")
    public String saveEstreno(@ModelAttribute AltaEstrenos altaEstreno){
        altaEstrenosService.saveEstreno(altaEstreno);
        return "redirect:/altaEstrenos";
    }

    @GetMapping("/altaEstrenos")
    public String listEstrenos(Model model){
        List<AltaEstrenos> altas = altaEstrenosService.getAllEstrenos();
        model.addAttribute("altaEstrenos", altas);
        return "alta-estrenos";
    }

    @GetMapping("/altaPeliculas/form")
    public String showPeliculasForm(Model model) {
        model.addAttribute("altaPelicula", new AltaPeliculas());
        return "alta-peliculas-form";
    }

    @PostMapping("/altaPeliculas/form")
    public String savePelicula(@ModelAttribute AltaPeliculas altaPelicula){
        altaPeliculasService.savePelicula(altaPelicula);
        return "redirect:/altaPeliculas";
    }

    @GetMapping("/altaPeliculas")
    public String listPeliculas(Model model){
        List<AltaPeliculas> altas = altaPeliculasService.getAllPeliculas();
        model.addAttribute("altaPeliculas", altas);
        return "alta-peliculas";
    }
    
}
