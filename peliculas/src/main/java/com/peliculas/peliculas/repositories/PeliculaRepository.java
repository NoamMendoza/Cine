package com.peliculas.peliculas.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.peliculas.peliculas.models.Pelicula;

@Repository
public interface PeliculaRepository extends MongoRepository<Pelicula, String> {
}