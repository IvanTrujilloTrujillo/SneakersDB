package com.ironhack.sneakers.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Sneaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private double price;
    private boolean specialEdition;
    private String author;
    private Date creationDate;
    private String artistCollaborator;

    public Sneaker() {
    }

    public Sneaker(String name, double price, boolean specialEdition, String author, Date creationDate, String artistCollaborator) {
        this.name = name;
        this.price = price;
        this.specialEdition = specialEdition;
        this.author = author;
        this.creationDate = creationDate;
        this.artistCollaborator = artistCollaborator;
    }

    public Sneaker(Integer id, String name, double price, boolean specialEdition, String author, Date creationDate, String artistCollaborator) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.specialEdition = specialEdition;
        this.author = author;
        this.creationDate = creationDate;
        this.artistCollaborator = artistCollaborator;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isSpecialEdition() {
        return specialEdition;
    }

    public void setSpecialEdition(boolean specialEdition) {
        this.specialEdition = specialEdition;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getArtistCollaborator() {
        return artistCollaborator;
    }

    public void setArtistCollaborator(String artistCollaborator) {
        this.artistCollaborator = artistCollaborator;
    }
}
