package com.peliculas.peliculas.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.peliculas.peliculas.models.Pelicula;
import com.peliculas.peliculas.service.MovieService;

@Controller
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/peliculas")
    public String getMovies(Model model) {
        List<Pelicula> movies = movieService.getAllMovies();
        model.addAttribute("movies", movies);
        return "peliculas";
    }
}