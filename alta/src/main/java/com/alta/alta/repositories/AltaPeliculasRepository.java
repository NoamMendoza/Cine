package com.alta.alta.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.alta.alta.models.AltaPeliculas;

public interface AltaPeliculasRepository extends MongoRepository<AltaPeliculas, String> {
    // Aquí puedes agregar métodos personalizados si es necesario
    
}
