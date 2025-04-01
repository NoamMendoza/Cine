package com.peliculas.peliculas.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.peliculas.peliculas.models.Pelicula;
import com.peliculas.peliculas.repositories.PeliculaRepository;

@Service
public class MovieService {
    private final PeliculaRepository movieRepository;

    public MovieService(PeliculaRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Pelicula> getAllMovies() {
        return movieRepository.findAll();
    }
}
