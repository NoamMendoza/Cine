package com.estrenos.estrenos.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.estrenos.estrenos.models.Estreno;

public interface  EstrenoRepository extends MongoRepository<Estreno, String> {
    
}
