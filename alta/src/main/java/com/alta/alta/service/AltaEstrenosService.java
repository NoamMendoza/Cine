package com.alta.alta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.alta.alta.models.AltaEstrenos;

@Service
public class AltaEstrenosService {
    private final MongoTemplate estrenosMongoTemplate;

    public AltaEstrenosService(@Qualifier("estrenosMongoTemplate") MongoTemplate estrenosMongoTemplate) {
        this.estrenosMongoTemplate = estrenosMongoTemplate;
    }

    public List<AltaEstrenos> getAllEstrenos() {
        return estrenosMongoTemplate.findAll(AltaEstrenos.class);
    }

    public void saveEstreno(AltaEstrenos estreno) {
        estrenosMongoTemplate.save(estreno);
    }
}
