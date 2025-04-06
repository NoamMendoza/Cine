package com.estrenos.estrenos.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.estrenos.estrenos.models.Estreno;
import com.estrenos.estrenos.service.EstrenoService;

@Controller
public class EstrenosController {
    private final EstrenoService estrenoService;
    public EstrenosController(EstrenoService estrenoService) {
        this.estrenoService = estrenoService;
    }
    @GetMapping("/estrenos")
    public String getEstrenos(Model model) {
        List<Estreno> estrenos = estrenoService.getAllEstrenos();
        model.addAttribute("estrenos", estrenos);
        return "estrenos";
    }
}