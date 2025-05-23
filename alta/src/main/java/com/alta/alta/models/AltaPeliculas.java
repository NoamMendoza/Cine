package com.alta.alta.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Peliculas") // Nombre de la colección en MongoDB    
public class AltaPeliculas {
    @Id
    private String id;
    private String title;
    private String description;
    private String image;
    private String showtimes;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getShowtimes() {
        return showtimes;
    }
    public void setShowtimes(String showtimes) {
        this.showtimes = showtimes;
    }
}
