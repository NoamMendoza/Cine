package com.alta.alta.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class AltaEstrenosConfig {

    @Bean
    public MongoDatabaseFactory estrenosDatabaseFactory() {
        return new SimpleMongoClientDatabaseFactory("mongodb://localhost:27017/CineEstrenos");
    }

    @Bean
    public MongoTemplate estrenosMongoTemplate(@Qualifier("estrenosDatabaseFactory") MongoDatabaseFactory factory) {
        return new MongoTemplate(factory);
    }
}
