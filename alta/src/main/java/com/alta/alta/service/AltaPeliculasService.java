package com.alta.alta.service;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.alta.alta.models.AltaPeliculas;

@Service
public class AltaPeliculasService {
    private final MongoTemplate peliculasMongoTemplate;

    public AltaPeliculasService(MongoTemplate peliculasMongoTemplate) {
        this.peliculasMongoTemplate = peliculasMongoTemplate;
    }

    public List<AltaPeliculas> getAllPeliculas() {
        return peliculasMongoTemplate.findAll(AltaPeliculas.class);
    }

    public void savePelicula(AltaPeliculas pelicula) {
        peliculasMongoTemplate.save(pelicula);
    }
}
