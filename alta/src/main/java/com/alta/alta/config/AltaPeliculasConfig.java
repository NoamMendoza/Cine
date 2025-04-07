package com.alta.alta.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class AltaPeliculasConfig {

    @Bean
    public MongoDatabaseFactory peliculasDatabaseFactory() {
        return new SimpleMongoClientDatabaseFactory("mongodb://localhost:27017/CinePeliculas");
    }

    @Primary
    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(peliculasDatabaseFactory());
    }
}
