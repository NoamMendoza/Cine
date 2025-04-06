package com.alta.alta.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.alta.alta.models.AltaEstrenos;
import com.alta.alta.service.AltaEstrenosService;

@Controller
public class AltaController {
    private final AltaEstrenosService altaService;
    public AltaController(AltaEstrenosService altaService) {
        this.altaService = altaService;
    }

    @GetMapping("/altaEstrenos")
    public String getAlta(Model model) {
        List<AltaEstrenos> altas = altaService.getAllEstrenos();
        model.addAttribute("altas", altas);
        return "alta";
    }
}
