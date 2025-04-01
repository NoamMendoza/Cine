package com.gateway.gateway.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
        List<Map<String, Object>> movies = List.of(
            Map.of(
                "title", "Movie 1",
                "description", "Description 1",
                "image", "https://via.placeholder.com/200x300",
                "showtimes", "15:30 | 18:00 | 20:30"
            ),
            Map.of(
                "title", "Movie 2",
                "description", "Description 2",
                "image", "https://via.placeholder.com/200x300",
                "showtimes", "16:00 | 19:00 | 21:30"
            ),
            Map.of(
                "title", "Movie 3",
                "description", "Description 3",
                "image", "https://via.placeholder.com/200x300",
                "showtimes", "14:00 | 17:00 | 20:00"
            )
        );
        model.addAttribute("movies", movies);
        return "index"; // Nombre de la plantilla Thymeleaf (index.html)
    }
}