package com.estrenos.estrenos.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Estrenos") // Nombre de la colección en MongoDB

public class Estreno {
    @Id
    private String id;
    private String title;
    private String description;
    private String image;
    private String showtimes;
    private String genre;
    private String director;
    private String actors;
    private String duration;
    private String releaseDate;

    // Getters y Setters
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
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getActors() {
        return actors;
    }
    public void setActors(String actors) {
        this.actors = actors;
    }
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getReleaseDate() {
        return releaseDate;
    }  
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
}
