package com.alta.alta.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.alta.alta.models.AltaEstrenos;

public interface AltaEstrenosRepository extends MongoRepository<AltaEstrenos, String> {
	
}
